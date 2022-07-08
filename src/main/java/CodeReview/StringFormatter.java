package CodeReview;

import java.util.*;

public class StringFormatter {
    public String formatString(String input, Object... arg) {
        StringBuilder output = new StringBuilder();
        List<Object> argument = new ArrayList<>(Arrays.asList(arg));
        List<String> splitInputs = new ArrayList<>(Arrays.asList(input.split("%")));
        output.append(splitInputs.remove(0));
        splitInputs.forEach( splitInput -> {
            if(splitInput.charAt(0) == 's') {
                output.append(argument.remove(0)).append(splitInput.substring(1));
            }
            if(splitInput.charAt(0) == 'd') {
                output.append(argument.remove(0)).append(splitInput.substring(1));
            }
            if(splitInput.charAt(0) == 'f') {
                output.append(argument.remove(0)).append(splitInput.substring(1));
            }
        });
        return output.toString();
    }
}
