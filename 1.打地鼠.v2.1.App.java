import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class App {
    private JPanel myPanel=new JPanel();
    private JLabel label_mouse=new JLabel();
    JLabel label_background=new JLabel();
    JLabel label_score=new JLabel();
        int i=0;
        int arr_2d[][]={
                {400,112},{672,112},{950,112},
                {245,218},{540,218},{840,218},
                {325,335},{685,335},
                {100,455},{495,455},{889,455},
                {180,590},{670,590}
        };
    public App() {
        label_mouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_mouse.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),75,75);
                i++;
                label_score.setText("Your Score:"+String.valueOf(i));
            }}); }
    void go(){
        myPanel.setLayout(null);
//        添加资源引用打包
        java.net.URL imgURL1 = App.class.getResource("mouse3.gif");
        label_mouse.setIcon(new ImageIcon(imgURL1));
        java.net.URL imgURL2 = App.class.getResource("background4.jpg");
        label_background.setIcon(new ImageIcon(imgURL2));

        label_mouse.setBounds(245,218,75,75);
        label_background.setBounds(0,0,1024,720);
        label_score.setBounds(50,-50,300,200);//3.组件初始的位置设置
        label_score.setFont(new Font("Arial",Font.BOLD,20));
        label_score.setForeground(Color.blue);
        label_score.setText("Your Score:0");
        myPanel.add(label_score);
        myPanel.add(label_mouse);//1.图片叠放次序
        myPanel.add(label_background);
        JFrame frame = new JFrame("港西打地鼠 v2.0");
        frame.setBounds(100,100,1024,720);
        frame.setContentPane(myPanel);//2.添加面板java方法
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//       frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
