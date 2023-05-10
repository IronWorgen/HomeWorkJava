package Seminar5.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Queen {
    private int x;
    private int y;

    public Queen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean moveQuinn(List<Queen> list) {
        int currentX = x;
        int currentY = y;
        // перемещение по горизонтали
        for (int i = 0; i < 8; i++) {
            for (Queen nextQuen :
                    list) {
                if (nextQuen.getPosition()[0] == i && nextQuen.getPosition()[1] == currentY) {
                    return false;
                }
            }
        }
        // перемещение по вертикали
        for (int i = 0; i < 8; i++) {
            for (Queen nextQuen :
                    list) {
                if (nextQuen.getPosition()[0] == currentX && nextQuen.getPosition()[1] == i) {
                    return false;
                }
            }
        }
        //перемещение вверх вправо
        while (currentX <= 8 && currentY >= 0) {
            currentX++;
            currentY--;
            for (Queen nextQuen :
                    list) {
                if (nextQuen.getPosition()[0] == currentX && nextQuen.getPosition()[1] == currentY) {
                    return false;
                }
            }

        }
        currentX = x;
        currentY = y;

        //перемещение Вниз вправо
        while (currentX <= 8 && currentY <= 8) {
            currentX++;
            currentY++;
            for (Queen nextQuen :
                    list) {
                if (nextQuen.getPosition()[0] == currentX && nextQuen.getPosition()[1] == currentY) {
                    return false;
                }
            }

        }
        currentX = x;
        currentY = y;

        //перемещение вниз влево
        while (currentX >= 0 && currentY <= 8) {
            currentX--;
            currentY++;
            for (Queen nextQuen :
                    list) {
                if (nextQuen.getPosition()[0] == currentX && nextQuen.getPosition()[1] == currentY) {
                    return false;
                }
            }

        }
        currentX = x;
        currentY = y;
        //перемещение вверх влево
        while (currentX >= 0 && currentY >= 0) {
            currentX--;
            currentY--;
            for (Queen nextQuen :
                    list) {
                if (nextQuen.getPosition()[0] == currentX && nextQuen.getPosition()[1] == currentY) {
                    return false;
                }
            }

        }

        return true;
    }

}
