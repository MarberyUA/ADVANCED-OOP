package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface Randomable {

    static String[] randomize() throws SideSizeException {
        Integer randomFiguresValue = (int) (Math.random() * 30);
        ArrayList<Figure> figures = new ArrayList<>(randomFiguresValue);
        for (int i = 0; i < randomFiguresValue; i++) {
            figures.add(i, getFigureWithRandomFields());
        }

        String[] result = new String[figures.size()];
        for(int j = 0; j < result.length; j++){
            result[j] = "Figure "+ figures.get(j).getClass().getSimpleName() + ", its high: "
                    + figures.get(j).getHigh() + ", its area: "
                    + figures.get(j).getArea() + ", its sides: "
                    + figures.get(j).print();
        }
        return result;
    }

    static Figure getFigureWithRandomFields() throws SideSizeException {
        Integer randomClassNumber = (int) (Math.random() * 2);
        Map<Integer, Figure> figureMap = new HashMap<>();

        Integer randomNum = getRandomSize(100);
        figureMap.put(0, new Square(randomNum, randomNum));

        figureMap.put(1, new Rectangle(getRandomSize(50), getRandomSize(100)));

        Integer randomNumTriangle = getRandomSize(50);
        figureMap.put(2, new IsoscelesTriangle(randomNumTriangle, randomNumTriangle, getRandomSize(40)));

        return figureMap.get(randomClassNumber);
    }

    static Integer getRandomSize(Integer toInt) {
        return (int) (Math.random() * toInt);
    }
}
