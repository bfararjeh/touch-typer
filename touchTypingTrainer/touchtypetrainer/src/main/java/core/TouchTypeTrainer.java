package core;

import components.GUI;
import components.TextGenerator;

public class TouchTypeTrainer {

    public static void main(String[] args) throws Exception {

        @SuppressWarnings("unused")
        GUI gui = new GUI();

        System.out.println(
            TextGenerator.generateList(TextGenerator.grabRawText()));
    }
}