(ns breakout.scenes.level
  (:require [breakout.engine.level :as engine]
            [breakout.cmp.board :as board]))

(defn scene []
  [board/cmp engine/ball-pos
             engine/ball-size
             engine/bricks
             engine/paddle-pos
             engine/level
             engine/score
             engine/lives
             engine/countdown-duration])
