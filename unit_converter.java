public class unit_converter {
    public static double converter_distance(String unitFrom, String unitTo, double value) {
        if (unitFrom.equals(unitTo)) {
            return value;
        }

        switch (unitFrom) {
            case "mm":
                break;
            case "cm":
                value *= 10;
                break;
            case "m":
                value *= 1000;
                break;
            case "km":
                value *= 1000000;
                break;
            case "in":
                value *= 25.4;
                break;
            case "ft":
                value *= 304.8;
                break;
            case "yd":
                value *= 914.4;
                break;
            case "mi":
                value *= 1609000;
                break;
        }

        switch (unitTo) {
            case "mm":
                break;
            case "cm":
                value /= 10;
                break;
            case "m":
                value /= 1000;
                break;
            case "km":
                value /= 1000000;
                break;
            case "in":
                value /= 25.4;
                break;
            case "ft":
                value /= 304.8;
                break;
            case "yd":
                value /= 914.4;
                break;
            case "mi":
                value /= 1609000;
                break;
        }

        return value;
    }

    public static double converter_mass(String unitFrom, String unitTo, double value) {
        if (unitFrom.equals(unitTo)) {
            return value;
        }

        switch (unitFrom) {
            case "mg":
                break;
            case "g":
                value *= 1000;
                break;
            case "kg":
                value *= 1000000;
                break;
            case "t":
                value *= 1000000000;
                break;
            case "oz":
                value *= 28349.5;
                break;
            case "lb":
                value *= 453592;
                break;
            case "tn":
                value *= 907200000;
                break;
        }

        switch (unitTo) {
            case "mg":
                break;
            case "g":
                value /= 1000;
                break;
            case "kg":
                value /= 1000000;
                break;
            case "t":
                value /= 1000000000;
                break;
            case "oz":
                value /= 28349.5;
                break;
            case "lb":
                value /= 453592;
                break;
            case "tn":
                value /= 907200000;
                break;
        }

        return value;
    }

    public static double converter_volume(String unitFrom, String unitTo, double value) {
        if (unitFrom.equals(unitTo)) {
            return value;
        }

        switch (unitFrom) {
            case "mL":
                break;
            case "L":
                value *= 1000;
                break;
            case "tsp":
                value *= 5.91939;
                break;
            case "Tbsp":
                value *= 17.7582;
                break;
            case "floz":
                value *= 29.5735;
                break;
            case "cp":
                value *= 236.588;
                break;
            case "pt":
                value *= 473.176;
                break;
            case "qt":
                value *= 946.353;
                break;
            case "gal":
                value *= 3785.41;
                break;
        }

        switch (unitTo) {
            case "mL":
                break;
            case "L":
                value /= 1000;
                break;
            case "tsp":
                value /= 5.91939;
                break;
            case "Tbsp":
                value /= 17.7582;
                break;
            case "floz":
                value /= 29.5735;
                break;
            case "cp":
                value /= 236.588;
                break;
            case "pt":
                value /= 473.176;
                break;
            case "qt":
                value /= 946.353;
                break;
            case "gal":
                value /= 3785.41;
                break;
        }
        
        return value;
    }
}
