(ns ring.middleware.ctype-by-uriext
  "Augment Ring responses with Content-Type guessed by the resource uri."
  (:use ring.middleware.mime-types)
  (:require [ring.util.response :as res]))

(defn wrap-ctype-by-uriext
  "Wrap a ring handler to set the Content-Type header of the response
  determined by the extension of the request uri"
  [handler & [custom-mime-types]]
  (let [mime-types (merge base-mime-types custom-mime-types)]
    (fn [request]
      (let [response (handler request)]
        (if response
          (let [{:keys [uri]} request]
            (res/content-type response (guess-mime-type uri mime-types)) ))))))
