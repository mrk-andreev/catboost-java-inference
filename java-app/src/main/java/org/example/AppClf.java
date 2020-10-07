package org.example;

import ai.catboost.CatBoostModel;
import ai.catboost.CatBoostPredictions;

public class AppClf {
  public static void main(String[] args) throws Exception {
    CatBoostModel model = CatBoostModel.loadModel("../models/clf.bin");
    CatBoostPredictions prediction = model.predict(
        new float[] {
            14.23f,
            1.71f,
            2.43f,
            15.6f,
            127.0f,
            2.8f,
            3.06f,
            0.28f,
            2.29f,
            5.64f,
            1.04f,
            3.92f,
            1065.0f
        },
        new String[] {
            "f_0",
            "f_1",
            "f_2",
            "f_3",
            "f_4",
            "f_5",
            "f_6",
            "f_7",
            "f_8",
            "f_9",
            "f_10",
            "f_11",
            "f_12"
        }
    );
    int i = 0;
    System.out.println(prediction);
    System.out.println(1);
  }
}
