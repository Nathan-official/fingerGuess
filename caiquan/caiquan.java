package caiquan;

import java.util.Scanner;

    public class caiquan{
        Scanner input = new Scanner(System.in);
        int num;
        String name;
        String name1;
        String answer;
        String suan;
        String suan1;
        int i = 1;
        int win = 0;
        int fail = 0;


        //游戏规则
        public void guize() {
            System.out.println("出拳规则：1.剪刀 2.石头 3.布");
            System.out.println("请选择对方角色(1.刘备 2.孙权 3.曹操)");
            num = input.nextInt();
            switch (num) {
                case 1:
                    name = "刘备";
                    break;
                case 2:
                    name = "孙权";
                    break;
                case 3:
                    name = "曹操";
                    break;
                default:
                    System.out.println("输入错误！");
                    guize();
                    break;
            }
            System.out.println("请输入你的姓名：");
            name1 = input.next();
            System.out.println(name1+" VS "+name+"对战:\n");
            System.out.println("要开始吗？(y/n)");
            answer = input.next();
            if (answer.equals("y")) {
                chuquan();
            }else{
                jieguo();
            }
        }



        //出拳方法
        public void chuquan() {
            System.out.println("请出拳：1.剪刀 2.石头 3.布(请输入相应的数字)");
            num = input.nextInt();
            switch (num) {
                case 1:
                    suan = "剪刀";
                    break;
                case 2:
                    suan = "石头";
                    break;
                case 3:
                    suan = "布";
                    break;

                default:
                    System.out.println("输入错误！");
                    chuquan();
                    break;
            }
            System.out.println("你出拳："+suan);
            int random = (int)(Math.random()*2)+1;
            switch (random) {
                case 1:
                    suan1 = "剪刀";
                    break;
                case 2:
                    suan1 = "石头";
                    break;
                case 3:
                    suan1 = "布";
                    break;
            }
            System.out.println(name+"出拳："+suan1);
            if (suan.equals(suan1)) {
                System.out.println("结果：平局！");
            }else if(suan.equals("布")&&suan1.equals("石头")
                    || suan.equals("石头")&&suan1.equals("剪刀")
                    ||suan.equals("剪刀")&&suan1.equals("布")){
                System.out.println("你赢了！");
                win++;
            }else{
                System.out.println("你输了！");
                fail++;
            }
            System.out.println("是否开始下一轮？(y/n)");
            answer = input.next();
            if (answer.equals("y")) {
                i++;
                chuquan();
            }else{
                jieguo();
            }
        }

        //游戏结果
        public void jieguo(){
            System.out.println("*********************************");
            System.out.println(name+"VS"+name1);
            System.out.println("对战次数"+i+"\n");
            System.out.println("姓名 得分");
            System.out.println(name1 + " " + win);
            System.out.println(name +" "+ fail+"\n");
            if (win>fail) {
                System.out.println("结果：你赢了！");
            }else if(win==fail){
                System.out.println("结果：平局");
            }else {
                System.out.println("结果：继续努力");
            }
        }


        //调用方法
        public static void main(String[] args){
            caiquan game = new caiquan();
            System.out.println("------------------------------欢迎进入游戏-----------------------------\n");
            System.out.println("\n\t\t*****************************");
            System.out.println("\n\t\t******    猜拳          开始        ****");
            System.out.println("\n\t\t*****************************");
            game.guize();
        }

    }

