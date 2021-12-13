package com.example.demo_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//ControllerアノテーションでControllerを識別
@Controller
public class GreetingController {
    
    //"greeting"のURLと greetingメソッドをマッピング
    @GetMapping("/greeting")
    //String greetingにRequestParamでgreetingメソッドのnameパラメータにバインド、namパラメータの値がModelに追加されて、最終的にはビューテンプレからアクセス可能になる。
    public String greeting(@RequestParam(name="name",required = false,defaultValue = "World")String name,Model model)
    
    //greetingを返す
    {model.addAttribute("name", name);
        return "greeting";}

}
