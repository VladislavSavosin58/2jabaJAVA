/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lab1;

/**
 *
 * @author User
 */
  public class RecIntegral {
        private double lowerBound;
        private double upperBound;
        private double intervals;
        private double result;

        public RecIntegral(double lowerBound, double upperBound, double intervals) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.intervals = intervals;
        }

        public double getLowerBound() {
            return lowerBound;
        }

        public double getUpperBound() {
            return upperBound;
        }

        public double getIntervals() {
            return intervals;
        }

    }

    // ... (ваш текущий код)