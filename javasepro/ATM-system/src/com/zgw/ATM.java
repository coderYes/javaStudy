package com.zgw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>(); // []
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;

    public void start() {
        while (true) {
            System.out.println("=====欢迎您进入ATM系统=====");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    login();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }

    /**
     * 用户登录
     */
    private void login() {
        System.out.println("系统登陆");
        if (accounts.isEmpty()) {
            return;
        }
        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("您输入的登录卡号不存在，请确认========");
            } else {
                while (true) {
                    System.out.println("请输入您的登陆密码：");
                    String passWord = sc.next();
                    if (acc.getPassword().equals(passWord)) {
                        loginAcc = acc;
                        System.out.println("=====" + acc.getUserName() + "登陆成功=====");
                        showUserCommand();
                        return;
                    } else {
                        System.out.println("您输入的密码不正确，请确认=========");
                    }
                }
            }
        }
    }

    private void showUserCommand() {
        while (true) {
            System.out.println(loginAcc.getUserName() + "请选择如下的功能:");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    showAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    drawMoney();
                    break;
                case 4:
                    transformMoney();
                    break;
                case 5:
                    updatePassword();
                    return;
                case 6:
                    System.out.println(loginAcc.getUserName() + "退出系统成功==========");
                    return;
                case 7:
                    if (deleteAccount()) {
                        return;
                    }
                    break;
                default:
                    System.out.println("操作有误======");
            }
        }
    }

    /**
     * 修改密码
     */
    private void updatePassword() {
        System.out.println("=====账户修改密码操作=====");
        while (true) {
            System.out.println("请您输入当前账户密码：");
            String passWord = sc.next();
            if (loginAcc.getPassword().equals(passWord)) {
                while (true) {
                    System.out.println("请您输入新密码");
                    String newPassWord = sc.next();
                    System.out.println("请再次确认密码");
                    String newPassWord2 = sc.next();
                    if (newPassWord.equals(newPassWord2)) {
                        loginAcc.setPassword(newPassWord);
                        return;
                    } else {
                        System.out.println("两次密码不一致");
                    }
                }
            } else {
                System.out.println("您当前输入的密码不正确");
            }
        }
    }

    /**
     * 销户
     */
    private boolean deleteAccount() {
        System.out.println("=====进行销户操作=====");
        System.out.println("请问您确认销户吗？y/n");
        String command = sc.next();
        switch (command) {
            case "y":
                if (loginAcc.getMoney() == 0) {
                    accounts.remove(loginAcc);
                    System.out.println("销户成功!");
                    return true;
                } else {
                    System.out.println("对不起，您的账户中存在金额，不允许销户");
                    return false;
                }
            default:
                System.out.println("好的，您的账户保留");
                return false;
        }
    }

    /**
     * 转账
     */
    private void transformMoney() {
        System.out.println("=====用户转账=====");
        if (accounts.size() < 2) {
            System.out.println("当前系统中只有一个账户，无法为其他账户转账");
            return;
        }
        if (loginAcc.getMoney() == 0) {
            System.out.println("当前余额为0，无法转账");
            return;
        }
        while (true) {
            System.out.println("请输入对方的卡号：");
            String cardId = sc.next();

            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                System.out.println("您输入的卡号不存在");
            } else {
                String name = acc.getUserName().substring(1);
                System.out.println("请输入【" + name + "】姓氏:");
                String preName = sc.next();
                if (acc.getUserName().startsWith(preName)) {
                    while (true) {
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        if (loginAcc.getMoney() >= money) {
                            loginAcc.setMoney(loginAcc.getMoney() - money);
                            acc.setMoney(acc.getMoney() + money);
                            return;
                        } else {
                            System.out.println("余额不足，无法转账，最多可转：" + loginAcc.getMoney());
                        }
                    }
                } else {
                    System.out.println("对不起，您输入的姓氏有误");
                }
            }
        }
    }

    /**
     * 取钱
     */
    private void drawMoney() {
        System.out.println("=====取钱操作=====");
        if (loginAcc.getMoney() < 100) {
            System.out.println("你的账户余额不足100=====");
            return;
        }

        while (true) {
            System.out.println("请输入取款金额");
            double money = sc.nextDouble();
            if (loginAcc.getMoney() >= money) {
                if (money > loginAcc.getLimit()) {
                    System.out.println("您当前取款金额超过了每次限额，您每次最多可取：" + loginAcc.getLimit());
                } else {
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("您取款：" + money + "成功，剩余：" + loginAcc.getMoney());
                    break;
                }
            } else {
                System.out.println("余额不足====");
            }
        }

    }

    /**
     * 存钱
     */
    private void depositMoney() {
        System.out.println("=====存钱操作=====");
        System.out.println("请输入您的存款金额：");
        double money = sc.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("恭喜您，存款：" + money + "，存款后余额为：" + loginAcc.getMoney());
    }

    /**
     * 查询当前登录的账户信息
     */
    private void showAccount() {
        System.out.println("=====当前您的账户信息如下=====");
        System.out.println("卡号：" + loginAcc.getCardId());
        System.out.println("户主：" + loginAcc.getUserName());
        System.out.println("性别：" + loginAcc.getSex());
        System.out.println("余额：" + loginAcc.getMoney());
        System.out.println("每次取现额度：" + loginAcc.getLimit());
    }

    /**
     * 完成用户开户操作
     */
    private void createAccount() {
        System.out.println("=====系统开户操作=====");
        // 创建一个账户对象
        Account acc = new Account();
        // 用户输入自己的开户信息，赋值给账户对象
        System.out.println("请您输入您的账户名称：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您输入的性别有误，请输入正确的性别");
            }
        }

        while (true) {
            System.out.println("请您输入您的账户密码：");
            String password = sc.next();
            System.out.println("再次确认密码");
            String password2 = sc.next();
            if (password.equals(password2)) {
                acc.setPassword(password2);
                break;
            } else {
                System.out.println("您输入的两次密码不一致，请重新输入");
            }
        }

        System.out.println("请您输入您的取现额度");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        String newCardId = createCardId();
        acc.setCardId(newCardId);

        accounts.add(acc);
        System.out.println("恭喜您" + acc.getUserName() + "开户成功，您的卡号是：" + acc.getCardId());
    }

    public String createCardId() {
        while (true) {
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10); // 0-9
                cardId += data;
            }
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                return cardId;
            }
        }

    }

    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }


}
