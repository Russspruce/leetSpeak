import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class LeetSpeak {
  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String userInput = request.queryParams("unelite");

      String elite = LeetStringArray(userInput);
      model.put("Elite", elite); //do we need this?
      return new ModelAndView(model, layout);

    }, new VelocityTemplateEngine());

  }

  public static String LeetStringArray(String str) {
    // // what does this return?
    // return year % 4 == 0;
    System.err.print(str);
    // char[] x = str.toCharArray();
    // System.err.print(x);
    String outPut = str.replace('e', '3');


    return outPut;



  }
}
