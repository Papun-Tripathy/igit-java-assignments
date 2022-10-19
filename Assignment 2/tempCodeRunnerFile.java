result = x;
        for (int i = 3; i <= n; i = i + 2) {

            long factorialValue = 1;
            long xToPowerValue = 1;

            for (int num = 1; num <= i; num++) {
                factorialValue *= num;
                xToPowerValue *= x;
            }

            double calculation = (double) xToPowerValue / factorialValue;
            result = count % 2 == 0 ? result + calculation : result - calculation;
            count++;
        }

        System.out.println("The result of the series: " + result);