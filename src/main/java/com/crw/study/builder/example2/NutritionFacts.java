package com.crw.study.builder.example2;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //必须注入的参数，可不用初始化
        private final int servingSize;
        private final int servings;

        //可选择注入的参数
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        //builder类构造方法
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        //将当前对象传入外部内的私有构造方法中
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    //私有构造方法
    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts [calories=" + calories + ", carbohydrate="
                + carbohydrate + ", fat=" + fat + ", servingSize="
                + servingSize + ", servings=" + servings + ", sodium=" + sodium
                + "]";
    }

    public static void main(String[] args) {
        NutritionFacts nf = new NutritionFacts.Builder(8, 20).calories(2).sodium(27).build();
        System.out.println(nf);
    }
}
