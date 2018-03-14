import java.lang.String;
import java.math.BigInteger;
import java.util.Arrays;

public class Quiz {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        StringBuilder name;
        for (int i = 0; i < roles.length; i++) {
            name = new StringBuilder();
            name = name.append(roles[i]).append(":");
            result  = result.append(name).append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if(textLines[j].startsWith(name.toString())) {
                    Integer number =  j + 1;
                    result = result.append(number.toString()).append(")").append(textLines[j].substring(name.length())).append("\n");
                }
            }
            result = result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        String [] roles= {"Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }
}