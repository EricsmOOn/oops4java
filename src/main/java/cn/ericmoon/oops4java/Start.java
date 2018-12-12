package cn.ericmoon.oops4java;

import cn.ericmoon.oops4java.view.GuiView;

/**
 * @ProjectName: oops4java
 * @CoderName: Eric Wong
 * @Date: 2018/12/6
 * @Desc: 程序入口
 */
public class Start {

    public static void main(String[] strs) {

        GuiView guiView = new GuiView();
        guiView.guiStart();

//        Scanner scn = new Scanner(System.in);
//        System.out.println("输入CLI进入命令行界面,输入GUI进入图形操作界面...");
//        String s = scn.next();
//
//        switch (s) {
//            case "CLI":
//                CliView cliView = new CliView();
//                cliView.CliStart(scn);
//                break;
//
//            case "GUI":
//                GuiView guiView = new GuiView();
//                guiView.guiStart();
//                break;
//
//            default:
//                System.out.println("无效的输入!请重新启动程序...");
//        }
    }
}
