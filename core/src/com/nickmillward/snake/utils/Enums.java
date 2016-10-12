package com.nickmillward.snake.utils;

import com.nickmillward.snake.SnakeGame;
import com.nickmillward.snake.screens.AbstractScreen;
import com.nickmillward.snake.screens.RestartScreen;
import com.nickmillward.snake.screens.StartScreen;

/**
 * Created by nmillward on 9/9/16.
 */
public class Enums {

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        STILL
    }

    public enum Difficulty {
        EASY(Constants.EASY_SNAKE_VELOCITY, Constants.EASY_DIFFICULTY_LABEL),
        MEDIUM(Constants.MEDIUM_SNAKE_VELOCITY, Constants.MEDIUM_DIFFICULTY_LABEL),
        HARD(Constants.HARD_SNAKE_VELOCITY, Constants.HARD_DIFFICULTY_LABEL);

        float velocity;
        String label;

        Difficulty(float velocity, String label) {
            this.velocity = velocity;
            this.label = label;
        }
    }

    public enum Screen {

        START_SCREEN {
            public AbstractScreen getScreen(Object... params) {
                return new StartScreen();
            }
        },

        RESTART_SCREEN {
            public AbstractScreen getScreen(Object... params) {
                return new RestartScreen();
            }
        },

        GAME {
            public AbstractScreen getScreen(Object... params) {
                return new SnakeGame();
            }
        };

        public abstract AbstractScreen getScreen(Object... params);

    }

}
