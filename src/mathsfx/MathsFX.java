/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsfx;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

/**
 *
 * @author jelis
 */
public class MathsFX extends Application {

    private Player player;
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    double lineX = WIDTH / 2 - 100;
    double lineY = HEIGHT / 3 + 50;
    private Pane root = new Pane();
    private Pane rootLearn = new Pane();
    private Pane rootMultiply = new Pane();
    private Pane rootAdd = new Pane();
    private VBox menuBox = new VBox(-5);
    private Line line;
    Scene scene = new Scene(root, WIDTH, HEIGHT);
    Scene sceneLearn = new Scene(rootLearn, WIDTH, HEIGHT);
    Scene sceneMultiply = new Scene(rootMultiply, WIDTH, HEIGHT);
    Scene sceneAdd = new Scene(rootAdd, WIDTH - 135, HEIGHT);

    //Buttons of MainMenu
    private Button btnLearn = new CreateButton("      Εκμάθηση         ", lineX + 10, lineY, 0);
    private Button btnAdd = new CreateButton("       Πρόσθεση        ", lineX + 10, lineY + 10, 0);
    private Button btnMinus = new CreateButton("       Αφαίρεση         ", lineX + 10, lineY + 20, 0);
    private Button btnCompare = new CreateButton("        Σύγκριση         ", lineX + 10, lineY + 30, 0);
    private Button btnMultiply = new CreateButton(" Πολλαπλασιασμός ", lineX + 10, lineY + 40, 0);
    private Button btnDivide = new CreateButton("        Διαίρεση         ", lineX + 10, lineY + 50, 0);
    private Button btnExit = new CreateButton("         Εξόδος          ", lineX + 10, lineY + 60, 0);
    private Button btnReturnMine = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    private Button btnReturnOnAdd = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button btnReturnOnMultiply = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi2_prosthesi = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi2_prosthesi_Solution = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi3_prosthesi = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi3_prosthesi_Solution = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi4_prosthesi = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button btnReturn6 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button btnNext = new CreateReturnButton("         Επόμενη ->        ", 975, 670);
    private Button Number61_Askisi2_prosthesi = new CreateButtonsAdd("/Number_61.jpg", 230, 20);
    private Button btnMultiplySelect1 = new CreateButtonAnswersMultiply("1", 200, 350, 1.5, 1.5);
    private Button btnMultiplySelect2 = new CreateButtonAnswersMultiply("2", 400, 350, 1.5, 1.5);
    private Button btnMultiplySelect3 = new CreateButtonAnswersMultiply("3", 600, 350, 1.5, 1.5);
    private Button btnMultiplySelect4 = new CreateButtonAnswersMultiply("4", 800, 350, 1.5, 1.5);
    private Button btnMultiplySelect5 = new CreateButtonAnswersMultiply("5", 1000, 350, 1.5, 1.5);
    private Button btnMultiplySelect6 = new CreateButtonAnswersMultiply("6", 300, 450, 1.5, 1.5);
    private Button btnMultiplySelect7 = new CreateButtonAnswersMultiply("7", 500, 450, 1.5, 1.5);
    private Button btnMultiplySelect8 = new CreateButtonAnswersMultiply("8", 700, 450, 1.5, 1.5);
    private Button btnMultiplySelect9 = new CreateButtonAnswersMultiply("9", 900, 450, 1.5, 1.5);
    private Button btnMultiplySelect10 = new CreateButtonAnswersMultiply("10", 600, 550, 1.5, 1.5);
    private Button Number77_Askisi2_Prosthesi = new CreateButtonsAdd("/Number_77.jpg", 10, 20);
    private Button Number55_Askisi2_prosthesi = new CreateButtonsAdd("/Number_55.jpg", -230, 20);
    private Button Number5_Askisi3_prosthesi = new CreateButtonsAdd("/Number_5.jpg", 230, 20);
    private Button Number9_Askisi3_prosthesi = new CreateButtonsAdd("/Number_9.jpg", 10, 20);
    private Button Number7_Askisi3_prosthesi = new CreateButtonsAdd("/Number_7.jpg", -230, 20);
    private Button Number65_Askisi4_prosthesi = new CreateButtonsAddWithMinWidth("/Number_65(cube).png", 230, 30, 133, 146);
    private Button Number49_Askisi4_prosthesi = new CreateButtonsAddWithMinWidth("/Number_49(cube).png", 10, 30, 133, 146);
    private Button Number70_Askisi4_prosthesi = new CreateButtonsAddWithMinWidth("/Number_70(cube).png", -230, 30, 133, 146);
    //Buttons for VideoPlayer
    private Button btnStartAddVideo = new CreateButton("         Πρόσθεση          ", 210, 650, 0);
    private Button btnStartMinusVideo = new CreateButton("         Αφαίρεση          ", 370, 650, 0);
    private Button btnStartCompareVideo = new CreateButton("         Σύγκριση          ", 525, 650, 0);
    private Button btnStartMultiVideo = new CreateButton("         Πολλαπλασιασμός         ", 680, 650, 0);
    private Button btnStartDivideVideo = new CreateButton("         Διαίρεση          ", 880, 650, 0);
    //Buttons for Answers
    private Button btnAdd1 = new CreateButtonAnswers("30", 390, 450, 1, 1);
    private Button btnAddCorrentAnswerOnFirst = new CreateButtonAnswers("27", 535, 450, 1, 1);
    private Button btnAdd3 = new CreateButtonAnswers("18", 670, 450, 1, 1);

    //Texts For Numbers
    private Text text = new CreateTextForNumbers(390, 370, "15", Color.RED, 70);
    private Text text2 = new CreateTextForNumbers(540, 370, "+", Color.RED, 70);
    private Text text3 = new CreateTextForNumbers(650, 370, "12", Color.RED, 70);
    private Text text4 = new CreateTextForNumbers(750, 370, "=", Color.RED, 70);

    //Αλεξ
    Button help_Askisi2_prosthesi = new CreateHelpButton(170, 0);
    Button Continue_Askisi2_prosthesi = new ButtonForContinue("         Συνέχεια ->        ");
    Button Continue_Askisi3_prosthesi = new ButtonForContinue("         Συνέχεια ->         ");

    ImageView Askisi1_prosthesi = new ImageView();
    Image Askisi1_prosthesi_Image = new Image(getClass().getResourceAsStream("/Askisi_1.png"));
    Image ScaleImage = new Image(getClass().getResourceAsStream("/Scale.jpg"));
    ImageView Scale = new ImageView();
    Image Help3Image1 = new Image(getClass().getResourceAsStream("/Dekada_Ask3.png"));
    Image Help3Image2 = new Image(getClass().getResourceAsStream("/Monada_Ask3.png"));
    Image ScaleSolutionImage = new Image(getClass().getResourceAsStream("/Askisi_1_Solution.jpg"));
    ImageView ScaleSolution = new ImageView();
    ImageView Help3_1 = new ImageView();
    ImageView Help3_2 = new ImageView();

    Image Askisi2_prosthesi_Image = new Image(getClass().getResourceAsStream("/Askisi_2.png"));
    ImageView Askisi2_prosthesi = new ImageView();
    Image Askisi2_prosthesi_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi_2_Solution.jpg"));
    ImageView Askisi2_prosthesi_Solution = new ImageView();

    Button help_Askisi3_prosthesi = new CreateHelpButton(170, 0);

    Image Askisi3_prosthesi_Image = new Image(getClass().getResourceAsStream("/Askisi_3.png"));
    ImageView Askisi3_prosthesi = new ImageView();

    Button help_Askisi4_prosthesi = new CreateHelpButton(170, 0);
    Image Askisi3_prosthesi_Image_Solution = new Image(getClass().getResourceAsStream("/Askisi_3_Solution.png"));
    ImageView Askisi3_prosthesi_Solution = new ImageView();
    Button Return_Askisi4_prosthesi_Solution = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);

    //variables Askisi1 Afairesi
    Image Askisi1_afairesi_Image = new Image(getClass().getResourceAsStream("/Askisi1_afairesi.png"));
    ImageView Askisi1_afairesi = new ImageView(Askisi1_afairesi_Image);
    private Button Askisi1_afairesi_choice1 = new CreateButtonsAddWithMinWidthAndSize("/Askisi1_afairesi_epilogi1.png", 230, 30, 89, 179, 179, 89);
    private Button Askisi1_afairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi1_afairesi_epilogi2.png", 10, 30, 108, 121, 121, 108);
    private Button Askisi1_afairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi1_afairesi_epilogi3.png", -230, 30, 82, 151, 151, 82);
    private Button btnReturn_Askisi1_afairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi1_afairesi = new CreateHelpButton(160, 0);

    //variables Askisi1 Afairesi Solution
    Image Askisi1_afairesi_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi1_afairesi_Solution.png"));
    ImageView Askisi1_afairesi_Solution = new ImageView(Askisi1_afairesi_Solution_Image);
    private Button btnReturn_Askisi1_afairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi1_afairesi = new ButtonForContinue("         Συνέχεια ->         ");

    //variables Askisi2 Afairesi
    Image Askisi2_afairesi_Image = new Image(getClass().getResourceAsStream("/Askisi2_afairesi.png"));
    ImageView Askisi2_afairesi = new ImageView(Askisi2_afairesi_Image);
    private Button Askisi2_afairesi_choice1 = new CreateButtonsAddWithMinWidthAndSize("/Askisi2_afairesi_epilogi1.png", 230, 30, 151, 200, 200, 151);
    private Button Askisi2_afairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi2_afairesi_epilogi2.png", 10, 30, 151, 200, 200, 151);
    private Button Askisi2_afairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi2_afairesi_epilogi3.png", -230, 30, 151, 200, 200, 151);
    private Button btnReturn_Askisi2_afairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi2_afairesi = new CreateHelpButton(160, 0);

    //variables Askisi2 Afairesi Solution
    Image Askisi2_afairesi_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi2_afairesi_Solution.png"));
    ImageView Askisi2_afairesi_Solution = new ImageView(Askisi2_afairesi_Solution_Image);
    private Button btnReturn_Askisi2_afairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi2_afairesi = new ButtonForContinue("         Συνέχεια ->         ");

    //variables Askisi3 Afairesi
    Image Askisi3_afairesi_Image = new Image(getClass().getResourceAsStream("/Askisi3_afairesi.png"));
    ImageView Askisi3_afairesi = new ImageView(Askisi3_afairesi_Image);
    private Button Askisi3_afairesi_choice1 = new CreateButtonsAddWithMinWidthAndSize("/Askisi3_afairesi_epilogi1.png", 180, 40, 150, 250, 250, 150);
    private Button Askisi3_afairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi3_afairesi_epilogi2.png", 0, 40, 150, 250, 250, 150);
    private Button Askisi3_afairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi3_afairesi_epilogi3.png", -180, 40, 150, 200, 250, 150);
    private Button btnReturn_Askisi3_afairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi3_afairesi = new CreateHelpButton(160, 0);

    //variables Askisi3 Afairesi Solution
    Image Askisi3_afairesi_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi3_afairesi_Solution.png"));
    ImageView Askisi3_afairesi_Solution = new ImageView(Askisi3_afairesi_Solution_Image);
    private Button btnReturn_Askisi3_afairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi3_afairesi = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi4 Afairesi 
    Image Askisi4_afairesi_Image = new Image(getClass().getResourceAsStream("/Askisi4_afairesi.png"));
    ImageView Askisi4_afairesi = new ImageView(Askisi4_afairesi_Image);
    private Button Askisi4_afairesi_choice1 = new CreateButtonsAddWithMinWidthAndSize("/Askisi4_afairesi_epilogi1.png", 230, 30, 180, 180, 180, 180);
    private Button Askisi4_afairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi4_afairesi_epilogi2.png", 10, 30, 180, 180, 180, 180);
    private Button Askisi4_afairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi4_afairesi_epilogi3.png", -230, 30, 180, 180, 180, 180);
    private Button btnReturn_Askisi4_afairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi4_afairesi = new CreateHelpButton(160, 0);

    //variables Askisi4 Afairesi Solution
    Image Askisi4_afairesi_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi4_afairesi_Solution.png"));
    ImageView Askisi4_afairesi_Solution = new ImageView(Askisi4_afairesi_Solution_Image);
    private Button btnReturn_Askisi4_afairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);

    //variables Askisi1 Sugkrites
    Image Askisi1_sugkritis_Image = new Image(getClass().getResourceAsStream("/Askisi1_sugkritis.png"));
    ImageView Askisi1_sugkritis = new ImageView(Askisi1_sugkritis_Image);
    private Button Askisi1_sugkritis_choice1 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_mikroteros.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi1_sugkritis_choice2 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_isos.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi1_sugkritis_choice3_Correct = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_megaluteros.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi1_sugkritis = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi1_sugkritis = new CreateHelpButton(160, 0);
    
    //variables Askisi1 Sugkrites Solution
    Image Askisi1_sugkritis_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi1_sugkritis_Solution.png"));
    ImageView Askisi1_sugkritis_Solution = new ImageView(Askisi1_sugkritis_Solution_Image);
    private Button btnReturn_Askisi1_sugkritis_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi1_sugkritis = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi2 Sugkrites
    Image Askisi2_sugkritis_Image = new Image(getClass().getResourceAsStream("/Askisi2_sugkritis.png"));
    ImageView Askisi2_sugkritis = new ImageView(Askisi2_sugkritis_Image);
    private Button Askisi2_sugkritis_choice1 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_mikroteros.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi2_sugkritis_choice2_Correct = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_isos.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi2_sugkritis_choice3 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_megaluteros.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi2_sugkritis = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi2_sugkritis = new CreateHelpButton(160, 0);
    
    //variables Askisi2 Sugkrites Solution
    Image Askisi2_sugkritis_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi2_sugkritis_Solution.png"));
    ImageView Askisi2_sugkritis_Solution = new ImageView(Askisi2_sugkritis_Solution_Image);
    private Button btnReturn_Askisi2_sugkritis_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi2_sugkritis = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi3 Sugkrites
    Image Askisi3_sugkritis_Image = new Image(getClass().getResourceAsStream("/Askisi3_sugkritis.png"));
    ImageView Askisi3_sugkritis = new ImageView(Askisi3_sugkritis_Image);
    private Button Askisi3_sugkritis_choice1 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_mikroteros.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi3_sugkritis_choice2_Correct = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_isos.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi3_sugkritis_choice3 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_megaluteros.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi3_sugkritis = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi3_sugkritis = new CreateHelpButton(160, 0);

    //variables Askisi3 Sugkrites Solution
    Image Askisi3_sugkritis_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi3_sugkritis_Solution.png"));
    ImageView Askisi3_sugkritis_Solution = new ImageView(Askisi3_sugkritis_Solution_Image);
    private Button btnReturn_Askisi3_sugkritis_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi3_sugkritis = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi4 Sugkrites
    Image Askisi4_sugkritis_Image = new Image(getClass().getResourceAsStream("/Askisi4_sugkritis.png"));
    ImageView Askisi4_sugkritis = new ImageView(Askisi4_sugkritis_Image);
    private Button Askisi4_sugkritis_choice1 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_mikroteros.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi4_sugkritis_choice2 = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_isos.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi4_sugkritis_choice3_Correct = new CreateButtonsAddWithMinWidthAndSize("/sugkritis_megaluteros.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi4_sugkritis = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi4_sugkritis = new CreateHelpButton(160, 0);
    
    //variables Askisi4 Sugkrites Solution
    Image Askisi4_sugkritis_Solution_Image = new Image(getClass().getResourceAsStream("/Askisi4_sugkritis_Solution.png"));
    ImageView Askisi4_sugkritis_Solution = new ImageView(Askisi4_sugkritis_Solution_Image);
    private Button btnReturn_Askisi4_sugkritis_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    
    
    //SceneAle scene2, scene3, scene4, scene5;
    Stage Window;

    private void addLine(double x, double y) {
        line = new Line(x, y, x, y + 300);
        line.setStrokeWidth(3);
        line.setStroke(Color.color(1, 1, 1, 0.75));
        line.setEffect(new DropShadow(5, Color.BLACK));
        line.setScaleY(0);
    }

    public static void startAnimationButton(Button b) {
        ScaleTransition st = new ScaleTransition(Duration.seconds(1.5), b);
        st.setToY(1);
        st.play();
    }

    private void startAnimationLine() {
        ScaleTransition st = new ScaleTransition(Duration.seconds(1.5), line);
        st.setToY(1);
        st.play();
    }

    public void startAdd() {
        Stage videoStage = new Stage();
        MenuBar menu = new MenuBar();

        player = new Player(getClass().getResource("add.mp4").toExternalForm());
        player.setTop(menu);

        // Adding player to the Scene 
        Scene Vid2 = new Scene(player, 1270, 720, Color.BLACK);

        videoStage.setScene(Vid2); // Setting the scene to stage 
        videoStage.show(); // Showing the stage 

        //stop video when Close window
        videoStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.out.println("Stage is closing");
                player.player.stop();
            }
        });
    }

    public void startMinus() {
        Stage videoStage = new Stage();
        MenuBar menu = new MenuBar();

        player = new Player(getClass().getResource("minus.mp4").toExternalForm());
        player.setTop(menu);

        // Adding player to the Scene 
        Scene Vid2 = new Scene(player, 1270, 720, Color.BLACK);

        videoStage.setScene(Vid2); // Setting the scene to stage 
        videoStage.show(); // Showing the stage 

        //stop video when Close window
        videoStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.out.println("Stage is closing");
                player.player.stop();
            }
        });
    }

    public void startCompare() {
        Stage videoStage = new Stage();
        MenuBar menu = new MenuBar();

        player = new Player(getClass().getResource("compare.mp4").toExternalForm());
        player.setTop(menu);

        // Adding player to the Scene 
        Scene Vid2 = new Scene(player, 1270, 720, Color.BLACK);

        videoStage.setScene(Vid2); // Setting the scene to stage 
        videoStage.show(); // Showing the stage 

        //stop video when Close window
        videoStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.out.println("Stage is closing");
                player.player.stop();
            }
        });
    }

    public void startMulti() {
        Stage videoStage = new Stage();
        MenuBar menu = new MenuBar();

        player = new Player(getClass().getResource("multi.mp4").toExternalForm());
        player.setTop(menu);

        // Adding player to the Scene 
        Scene Vid2 = new Scene(player, 950, 720, Color.BLACK);

        videoStage.setScene(Vid2); // Setting the scene to stage 
        videoStage.show(); // Showing the stage 

        //stop video when Close window
        videoStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.out.println("Stage is closing");
                player.player.stop();
            }
        });
    }

    public void startDivide() {
        Stage videoStage = new Stage();
        MenuBar menu = new MenuBar();

        player = new Player(getClass().getResource("divide.mp4").toExternalForm());
        player.setTop(menu);

        // Adding player to the Scene 
        Scene Vid2 = new Scene(player, 1270, 720, Color.BLACK);

        videoStage.setScene(Vid2); // Setting the scene to stage 
        videoStage.show(); // Showing the stage 

        //stop video when Close window
        videoStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                System.out.println("Stage is closing");
                player.player.stop();
            }
        });
    }

    //Sound for Correct Answers
    public void PlaySound() {
        AudioClip sEffect = new AudioClip(this.getClass().getResource("clap.mp3").toExternalForm());
        sEffect.setVolume(0.35);
        sEffect.play();
    }

    private Text t = new Text("Μπράβο μικρέ");

    @Override
    public void start(Stage primaryStage) {
        //Background Images
        ImageView imageView = new ImageView(new Image(getClass().getResource("bg_photo2.jpg").toExternalForm()));
        imageView.setFitWidth(WIDTH);
        imageView.setFitHeight(HEIGHT);

        ImageView imageView2 = new ImageView(new Image(getClass().getResource("bg_photo2.jpg").toExternalForm()));
        imageView2.setFitWidth(WIDTH);
        imageView2.setFitHeight(HEIGHT);

        ImageView imageView3 = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageView2.setFitWidth(WIDTH);
        imageView2.setFitHeight(HEIGHT);

        ImageView imageView4 = new ImageView(new Image(getClass().getResource("test.png").toExternalForm()));
        imageView2.setFitWidth(WIDTH);
        imageView2.setFitHeight(HEIGHT);

        //Titles
        Title title = new Title("Μαθηματικά");
        title.setTranslateX(WIDTH / 2 - title.getTitleWidth() / 2);
        title.setTranslateY(HEIGHT / 3);

        Title titleAdd = new Title("Κάνε την πράξη");
        titleAdd.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
        titleAdd.setTranslateY(HEIGHT / 4);

        Title titleLearn = new Title("Δίαλεξε την κατηγορία \n"
                + "που επιθυμείς να μάθεις");
        titleLearn.setTranslateX(WIDTH / 4 - title.getTitleWidth() / 2.5);
        titleLearn.setTranslateY(HEIGHT / 3);
        
        Title titleMultiply = new Title("    Δίαλεξε την προπαίδεια \n"
                + "που επιθυμείς να εξασκιθείς");
        titleMultiply.setTranslateX(WIDTH / 5 - title.getTitleWidth() / 2.5);
        titleMultiply.setTranslateY(HEIGHT / 5);

        t.setFill(Color.RED);
        t.setFont(new Font(50));
        t.setTranslateX(425);
        t.setTranslateY(280);
        //MainLine + animation
        addLine(lineX, lineY);
        startAnimationLine();
        menuBox.getChildren().addAll(btnLearn, btnAdd, btnMinus, btnCompare, btnMultiply, btnDivide, btnExit);
        menuBox.fillWidthProperty();
        menuBox.setAlignment(Pos.CENTER);
        menuBox.setFillWidth(true);

        //Buttons on Video
        btnExit.setOnAction(e -> Platform.exit());
        btnStartAddVideo.setOnAction(e -> startAdd());
        btnStartMinusVideo.setOnAction(e -> startMinus());
        btnStartCompareVideo.setOnAction(e -> startCompare());
        btnStartMultiVideo.setOnAction(e -> startMulti());
        btnStartDivideVideo.setOnAction(e -> startDivide());

        btnMultiplySelect1.setScaleX(1.5);
        btnMultiplySelect1.setScaleY(1.5);

        //Αλεξ
        Askisi1_prosthesi = new ImageView(Askisi1_prosthesi_Image);
        Askisi2_prosthesi = new ImageView(Askisi2_prosthesi_Image);
        Askisi3_prosthesi = new ImageView(Askisi3_prosthesi_Image);
        Window = primaryStage;
        Window.setTitle("Άσκησεις");

        //Images for Help3
        Help3_1 = new ImageView(Help3Image1);
        Help3_2 = new ImageView(Help3Image2);

        //Scale Help Image for 3rd Class
        Scale = new ImageView(ScaleImage);

        //Scale Solution
        ScaleSolution = new ImageView(ScaleSolutionImage);

        //Askisi2 Solution
        Askisi2_prosthesi_Solution = new ImageView(Askisi2_prosthesi_Solution_Image);

        //Askisi4 Solution
        Askisi3_prosthesi_Solution = new ImageView(Askisi3_prosthesi_Image_Solution);

        //Askisi2 sub help
        Image Askisi2_afairesi_help_image = new Image("/Askisi2_afairesi_help.png");
        ImageView Askisi2_afairesi_help = new ImageView(Askisi2_afairesi_help_image);

        //Askisi3 sub help
        Image Askisi3_afairesi_help_image = new Image("/Askisi3_afairesi_help.png");
        ImageView Askisi3_afairesi_help = new ImageView(Askisi3_afairesi_help_image);

        //Askisi4 sub help
        Image Askisi4_afairesi_help_image = new Image("/Askisi4_afairesi_help.png");
        ImageView Askisi4_afairesi_help = new ImageView(Askisi4_afairesi_help_image);

        //Askisi1 com help
        Image Askisi1_sugkritis_help_image = new Image("/Askisi1_sugkritis_help.png");
        ImageView Askisi1_sugkritis_help = new ImageView(Askisi1_sugkritis_help_image);
        
        //Askisi2 com help
        Image Askisi2_sugkritis_help_image = new Image("/Askisi2_sugkritis_help.png");
        ImageView Askisi2_sugkritis_help = new ImageView(Askisi2_sugkritis_help_image);
        
        //Askisi3 com help
        Image Askisi3_sugkritis_help_image = new Image("/Askisi3_sugkritis_help.png");
        ImageView Askisi3_sugkritis_help = new ImageView(Askisi3_sugkritis_help_image);
        
        //Askisi4 com help
        Image Askisi4_sugkritis_help_image = new Image("/Askisi4_sugkritis_help.png");
        ImageView Askisi4_sugkritis_help = new ImageView(Askisi4_sugkritis_help_image);
        
        //Layouts gia prosthesi
        StackPane Layout_Askisi2_prosthesi = new StackPane();
        StackPane Layout_Askisi2_prosthesi_Solution = new StackPane();
        StackPane Layout_Askisi3_prosthesi = new StackPane();
        StackPane Layout_Askisi3_prosthesi_Solution = new StackPane();
        StackPane Layout_Askisi4_prosthesi = new StackPane();
        StackPane Layout_Askisi4_prosthesi_Solution = new StackPane();
        
        //Layouts gia afairesi
        StackPane Layout_Askisi1_afairesi = new StackPane();
        StackPane Layout_Askisi1_afairesi_Solution = new StackPane();
        StackPane Layout_Askisi2_afairesi = new StackPane();
        StackPane Layout_Askisi2_afairesi_Solution = new StackPane();
        StackPane Layout_Askisi3_afairesi = new StackPane();
        StackPane Layout_Askisi3_afairesi_Solution = new StackPane();
        StackPane Layout_Askisi4_afairesi = new StackPane();
        StackPane Layout_Askisi4_afairesi_Solution = new StackPane();
        
        //Layouts gia sugkrisi
        StackPane Layout_Askisi1_sugkritis = new StackPane();
        StackPane Layout_Askisi1_sugkritis_Solution = new StackPane();
        StackPane Layout_Askisi2_sugkritis = new StackPane();
        StackPane Layout_Askisi2_sugkritis_Solution = new StackPane();
        StackPane Layout_Askisi3_sugkritis = new StackPane();
        StackPane Layout_Askisi3_sugkritis_Solution = new StackPane();
        StackPane Layout_Askisi4_sugkritis = new StackPane();
        StackPane Layout_Askisi4_sugkritis_Solution = new StackPane();
        
        //Adding Elements in Layouts gia prosthesi
        Layout_Askisi2_prosthesi.getChildren().addAll(Askisi1_prosthesi, Number61_Askisi2_prosthesi, Number77_Askisi2_Prosthesi, Number55_Askisi2_prosthesi, Return_Askisi2_prosthesi, help_Askisi2_prosthesi);
        Layout_Askisi2_prosthesi_Solution.getChildren().addAll(ScaleSolution, Return_Askisi2_prosthesi_Solution, Continue_Askisi2_prosthesi);
        Layout_Askisi3_prosthesi.getChildren().addAll(Askisi2_prosthesi, Number5_Askisi3_prosthesi, Number9_Askisi3_prosthesi, Number7_Askisi3_prosthesi, Return_Askisi3_prosthesi, help_Askisi3_prosthesi);
        Layout_Askisi3_prosthesi_Solution.getChildren().addAll(Askisi2_prosthesi_Solution, Return_Askisi3_prosthesi_Solution, Continue_Askisi3_prosthesi);
        Layout_Askisi4_prosthesi.getChildren().addAll(Askisi3_prosthesi, Number65_Askisi4_prosthesi, Number49_Askisi4_prosthesi, Number70_Askisi4_prosthesi, help_Askisi4_prosthesi, Return_Askisi4_prosthesi);
        Layout_Askisi4_prosthesi_Solution.getChildren().addAll(Askisi3_prosthesi_Solution, Return_Askisi4_prosthesi_Solution);

        //Adding Elements in Layouts gia afairesi
        Layout_Askisi1_afairesi.getChildren().addAll(Askisi1_afairesi, Askisi1_afairesi_choice1, Askisi1_afairesi_choice2, Askisi1_afairesi_choice3, btnReturn_Askisi1_afairesi, help_Askisi1_afairesi);
        Layout_Askisi1_afairesi_Solution.getChildren().addAll(Askisi1_afairesi_Solution, btnReturn_Askisi1_afairesi_Solution, Continue_Askisi1_afairesi);
        Layout_Askisi2_afairesi.getChildren().addAll(Askisi2_afairesi, Askisi2_afairesi_choice1, Askisi2_afairesi_choice2, Askisi2_afairesi_choice3, btnReturn_Askisi2_afairesi, help_Askisi2_afairesi);
        Layout_Askisi2_afairesi_Solution.getChildren().addAll(Askisi2_afairesi_Solution, btnReturn_Askisi2_afairesi_Solution, Continue_Askisi2_afairesi);
        Layout_Askisi3_afairesi.getChildren().addAll(Askisi3_afairesi, Askisi3_afairesi_choice1, Askisi3_afairesi_choice2, Askisi3_afairesi_choice3, btnReturn_Askisi3_afairesi, help_Askisi3_afairesi);
        Layout_Askisi3_afairesi_Solution.getChildren().addAll(Askisi3_afairesi_Solution, btnReturn_Askisi3_afairesi_Solution, Continue_Askisi3_afairesi);
        Layout_Askisi4_afairesi.getChildren().addAll(Askisi4_afairesi, Askisi4_afairesi_choice1, Askisi4_afairesi_choice2, Askisi4_afairesi_choice3, btnReturn_Askisi4_afairesi, help_Askisi4_afairesi);
        Layout_Askisi4_afairesi_Solution.getChildren().addAll(Askisi4_afairesi_Solution, btnReturn_Askisi4_afairesi_Solution);
        
        //Adding Elements in Layouts gia sugkrisi
        Layout_Askisi1_sugkritis.getChildren().addAll(Askisi1_sugkritis, Askisi1_sugkritis_choice1, Askisi1_sugkritis_choice2, Askisi1_sugkritis_choice3_Correct, btnReturn_Askisi1_sugkritis, help_Askisi1_sugkritis);
        Layout_Askisi1_sugkritis_Solution.getChildren().addAll(Askisi1_sugkritis_Solution, btnReturn_Askisi1_sugkritis_Solution, Continue_Askisi1_sugkritis);
        Layout_Askisi2_sugkritis.getChildren().addAll(Askisi2_sugkritis, Askisi2_sugkritis_choice1, Askisi2_sugkritis_choice2_Correct, Askisi2_sugkritis_choice3, btnReturn_Askisi2_sugkritis, help_Askisi2_sugkritis);
        Layout_Askisi2_sugkritis_Solution.getChildren().addAll(Askisi2_sugkritis_Solution, btnReturn_Askisi2_sugkritis_Solution, Continue_Askisi2_sugkritis);
        Layout_Askisi3_sugkritis.getChildren().addAll(Askisi3_sugkritis, Askisi3_sugkritis_choice1, Askisi3_sugkritis_choice2_Correct, Askisi3_sugkritis_choice3, btnReturn_Askisi3_sugkritis, help_Askisi3_sugkritis);
        Layout_Askisi3_sugkritis_Solution.getChildren().addAll(Askisi3_sugkritis_Solution, btnReturn_Askisi3_sugkritis_Solution, Continue_Askisi3_sugkritis);
        Layout_Askisi4_sugkritis.getChildren().addAll(Askisi4_sugkritis, Askisi4_sugkritis_choice1, Askisi4_sugkritis_choice2, Askisi4_sugkritis_choice3_Correct, btnReturn_Askisi4_sugkritis, help_Askisi4_sugkritis);
        Layout_Askisi4_sugkritis_Solution.getChildren().addAll(Askisi4_sugkritis_Solution, btnReturn_Askisi4_sugkritis_Solution);
        
        //Scenes gia prosthesi
        Scene sceneAddFirst = new Scene(Layout_Askisi2_prosthesi, 1164, 365);
        Scene sceneAddFirstCorrect = new Scene(Layout_Askisi2_prosthesi_Solution, 1164, 365);
        Scene sceneAddSecond = new Scene(Layout_Askisi3_prosthesi, 1164, 365);
        Scene sceneAddSecondCorrect = new Scene(Layout_Askisi3_prosthesi_Solution, 1164, 365);
        Scene sceneAddThird = new Scene(Layout_Askisi4_prosthesi, 1164, 600);
        Scene sceneAddThirdCorrect = new Scene(Layout_Askisi4_prosthesi_Solution, 1164, 600);

        //Scenes gia afairesi
        Scene sceneSubFirst = new Scene(Layout_Askisi1_afairesi, 1164, 500);
        Scene sceneSubFirstCorrect = new Scene(Layout_Askisi1_afairesi_Solution, 1164, 500);
        Scene sceneSubSecond = new Scene(Layout_Askisi2_afairesi, 1164, 500);
        Scene sceneSubSecondCorrect = new Scene(Layout_Askisi2_afairesi_Solution, 1164, 500);
        Scene sceneSubThird = new Scene(Layout_Askisi3_afairesi, 1164, 500);
        Scene sceneSubThirdCorrect = new Scene(Layout_Askisi3_afairesi_Solution, 1164, 500);
        Scene sceneSubFourth = new Scene(Layout_Askisi4_afairesi, 1164, 500);
        Scene sceneSubFourthCorrect = new Scene(Layout_Askisi4_afairesi_Solution, 1164, 500);
        
        //Scenes gia sugkrisi
        Scene sceneComFirst = new Scene (Layout_Askisi1_sugkritis, 1164, 500);
        Scene sceneComFirstCorrect = new Scene (Layout_Askisi1_sugkritis_Solution, 1164, 500);
        Scene sceneComSecond = new Scene (Layout_Askisi2_sugkritis, 1164, 500);
        Scene sceneComSecondCorrect = new Scene(Layout_Askisi2_sugkritis_Solution, 1164, 500);
        Scene sceneComThird = new Scene (Layout_Askisi3_sugkritis, 1164, 500);
        Scene sceneComThirdCorrect = new Scene (Layout_Askisi3_sugkritis_Solution, 1164, 500);
        Scene sceneComFourth = new Scene (Layout_Askisi4_sugkritis, 1164, 500);
        Scene sceneComFourthCorrect = new Scene (Layout_Askisi4_sugkritis_Solution, 1164, 500);
        
        //Prosthesi Button Actions
        Number61_Askisi2_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Number55_Askisi2_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi2_prosthesi.setOnAction(e -> Help.display("Βοήθεια", Scale));
        Number77_Askisi2_Prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                Window.setScene(sceneAddFirstCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Number9_Askisi3_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Number5_Askisi3_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi3_prosthesi.setOnAction(e -> Help2.display("Βοήθεια", "Το κάθε δάχτυλο είναι μια μονάδα!"));
        Number7_Askisi3_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                Window.setScene(sceneAddSecondCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Number49_Askisi4_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Number70_Askisi4_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Number65_Askisi4_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                Window.setScene(sceneAddThirdCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        help_Askisi4_prosthesi.setOnAction(e -> Help3.display("Βοήθεια", Help3_1, Help3_2));
        Return_Askisi4_prosthesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi4_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi2_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi4_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        
        Return_Askisi3_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi3_prosthesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
                
        //Koumpi Afairesi Action
        btnMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_afairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneSubFirst);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        
        //afairesi Button Actions
        Askisi1_afairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        Askisi1_afairesi_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi1_afairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", "Το κάθε παράθυρο χωράει 3 άτομα!"));
        Askisi2_afairesi_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        Askisi2_afairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi2_afairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi2_afairesi_help));
        Askisi3_afairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        Askisi3_afairesi_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi3_afairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi3_afairesi_help));
        Askisi4_afairesi_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        Askisi4_afairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Απάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi4_afairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi4_afairesi_help));
        
        btnReturn_Askisi1_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi1_afairesi_choice1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneSubFirstCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi1_afairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Continue_Askisi1_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneSubSecond);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi2_afairesi_choice3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneSubSecondCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi2_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi2_afairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Continue_Askisi2_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi3_afairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneSubThird);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi3_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi3_afairesi_choice1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi3_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneSubThirdCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi3_afairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Continue_Askisi3_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_afairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneSubFourth);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi4_afairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi4_afairesi_choice3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_afairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneSubFourthCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi4_afairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        
        //Koumpi Sugkrisi Action
        btnCompare.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_sugkritis);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneComFirst);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        
        //Sugkritis Button Actions
        Askisi1_sugkritis_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi1_sugkritis_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi1_sugkritis_choice3_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_sugkritis_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneComFirstCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        help_Askisi1_sugkritis.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi1_sugkritis_help));
        btnReturn_Askisi1_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi1_sugkritis_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Continue_Askisi1_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_sugkritis_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneComSecond);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi2_sugkritis_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi2_sugkritis_choice2_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_sugkritis_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneComSecondCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi2_sugkritis_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        btnReturn_Askisi2_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        help_Askisi2_sugkritis.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi2_sugkritis_help));
        btnReturn_Askisi2_sugkritis_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Continue_Askisi2_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi3_sugkritis);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneComThird);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi3_sugkritis_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi3_sugkritis_choice2_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_sugkritis_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneComThirdCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi3_sugkritis_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        btnReturn_Askisi3_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        help_Askisi3_sugkritis.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi3_sugkritis_help));
        btnReturn_Askisi3_sugkritis_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Continue_Askisi3_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_sugkritis);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneComFourth);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Askisi4_sugkritis_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi4_sugkritis_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi4_sugkritis_choice3_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_sugkritis_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                PlaySound();
                primaryStage.setScene(sceneComFourthCorrect);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        help_Askisi4_sugkritis.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi4_sugkritis_help));
        btnReturn_Askisi4_sugkritis.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnReturn_Askisi4_sugkritis_Solution.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        
        //alignments prosthesi
        Layout_Askisi2_prosthesi.setAlignment(Number61_Askisi2_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi2_prosthesi.setAlignment(Number77_Askisi2_Prosthesi, Pos.TOP_CENTER);
        Layout_Askisi2_prosthesi.setAlignment(Number55_Askisi2_prosthesi, Pos.TOP_RIGHT);
        Layout_Askisi2_prosthesi.setAlignment(Return_Askisi2_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi2_prosthesi.setAlignment(help_Askisi2_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi2_prosthesi_Solution.setAlignment(Return_Askisi2_prosthesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi2_prosthesi_Solution.setAlignment(Continue_Askisi2_prosthesi, Pos.TOP_RIGHT);
        Layout_Askisi3_prosthesi.setAlignment(Number5_Askisi3_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi3_prosthesi.setAlignment(Number9_Askisi3_prosthesi, Pos.TOP_CENTER);
        Layout_Askisi3_prosthesi.setAlignment(Number7_Askisi3_prosthesi, Pos.TOP_RIGHT);
        Layout_Askisi3_prosthesi.setAlignment(help_Askisi3_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi3_prosthesi.setAlignment(Return_Askisi3_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi3_prosthesi_Solution.setAlignment(Return_Askisi3_prosthesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi3_prosthesi_Solution.setAlignment(Continue_Askisi3_prosthesi, Pos.TOP_RIGHT);
        Layout_Askisi4_prosthesi.setAlignment(Number65_Askisi4_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi4_prosthesi.setAlignment(Number49_Askisi4_prosthesi, Pos.TOP_CENTER);
        Layout_Askisi4_prosthesi.setAlignment(Number70_Askisi4_prosthesi, Pos.TOP_RIGHT);
        Layout_Askisi4_prosthesi.setAlignment(Return_Askisi4_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi4_prosthesi.setAlignment(help_Askisi4_prosthesi, Pos.TOP_LEFT);
        Layout_Askisi4_prosthesi_Solution.setAlignment(Return_Askisi4_prosthesi_Solution, Pos.TOP_CENTER);

        //alignments afairesi
        Layout_Askisi1_afairesi.setAlignment(Askisi1_afairesi_choice1, Pos.TOP_LEFT);
        Layout_Askisi1_afairesi.setAlignment(Askisi1_afairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi1_afairesi.setAlignment(Askisi1_afairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi1_afairesi.setAlignment(btnReturn_Askisi1_afairesi, Pos.TOP_LEFT);
        Layout_Askisi1_afairesi.setAlignment(help_Askisi1_afairesi, Pos.TOP_LEFT);
        Layout_Askisi1_afairesi_Solution.setAlignment(btnReturn_Askisi1_afairesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi1_afairesi_Solution.setAlignment(Continue_Askisi1_afairesi, Pos.TOP_RIGHT);
        Layout_Askisi2_afairesi.setAlignment(Askisi2_afairesi_choice1, Pos.TOP_LEFT);
        Layout_Askisi2_afairesi.setAlignment(Askisi2_afairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi2_afairesi.setAlignment(Askisi2_afairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi2_afairesi.setAlignment(btnReturn_Askisi2_afairesi, Pos.TOP_LEFT);
        Layout_Askisi2_afairesi.setAlignment(help_Askisi2_afairesi, Pos.TOP_LEFT);
        Layout_Askisi2_afairesi_Solution.setAlignment(btnReturn_Askisi2_afairesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi2_afairesi_Solution.setAlignment(Continue_Askisi2_afairesi, Pos.TOP_RIGHT);
        Layout_Askisi3_afairesi.setAlignment(Askisi3_afairesi_choice1, Pos.TOP_LEFT);
        Layout_Askisi3_afairesi.setAlignment(Askisi3_afairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi3_afairesi.setAlignment(Askisi3_afairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi3_afairesi.setAlignment(btnReturn_Askisi3_afairesi, Pos.TOP_LEFT);
        Layout_Askisi3_afairesi.setAlignment(help_Askisi3_afairesi, Pos.TOP_LEFT);
        Layout_Askisi3_afairesi_Solution.setAlignment(btnReturn_Askisi3_afairesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi3_afairesi_Solution.setAlignment(Continue_Askisi3_afairesi, Pos.TOP_RIGHT);
        Layout_Askisi4_afairesi.setAlignment(Askisi4_afairesi_choice1, Pos.TOP_LEFT);
        Layout_Askisi4_afairesi.setAlignment(Askisi4_afairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi4_afairesi.setAlignment(Askisi4_afairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi4_afairesi.setAlignment(btnReturn_Askisi4_afairesi, Pos.TOP_LEFT);
        Layout_Askisi4_afairesi.setAlignment(help_Askisi4_afairesi, Pos.TOP_LEFT);
        Layout_Askisi4_afairesi_Solution.setAlignment(btnReturn_Askisi4_afairesi_Solution, Pos.TOP_CENTER);

        //alignments sugkritis
        Layout_Askisi1_sugkritis.setAlignment(Askisi1_sugkritis_choice1, Pos.TOP_LEFT);
        Layout_Askisi1_sugkritis.setAlignment(Askisi1_sugkritis_choice2, Pos.TOP_CENTER);
        Layout_Askisi1_sugkritis.setAlignment(Askisi1_sugkritis_choice3_Correct, Pos.TOP_RIGHT);
        Layout_Askisi1_sugkritis.setAlignment(btnReturn_Askisi1_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi1_sugkritis.setAlignment(help_Askisi1_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi1_sugkritis_Solution.setAlignment(btnReturn_Askisi1_sugkritis_Solution, Pos.TOP_LEFT);
        Layout_Askisi1_sugkritis_Solution.setAlignment(Continue_Askisi1_sugkritis, Pos.TOP_RIGHT);
        Layout_Askisi2_sugkritis.setAlignment(Askisi2_sugkritis_choice1, Pos.TOP_LEFT);
        Layout_Askisi2_sugkritis.setAlignment(Askisi2_sugkritis_choice2_Correct, Pos.TOP_CENTER);
        Layout_Askisi2_sugkritis.setAlignment(Askisi2_sugkritis_choice3, Pos.TOP_RIGHT);
        Layout_Askisi2_sugkritis.setAlignment(btnReturn_Askisi2_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi2_sugkritis.setAlignment(help_Askisi2_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi2_sugkritis_Solution.setAlignment(btnReturn_Askisi2_sugkritis_Solution, Pos.TOP_LEFT);
        Layout_Askisi2_sugkritis_Solution.setAlignment(Continue_Askisi2_sugkritis, Pos.TOP_RIGHT);
        Layout_Askisi3_sugkritis.setAlignment(Askisi3_sugkritis_choice1, Pos.TOP_LEFT);
        Layout_Askisi3_sugkritis.setAlignment(Askisi3_sugkritis_choice2_Correct, Pos.TOP_CENTER);
        Layout_Askisi3_sugkritis.setAlignment(Askisi3_sugkritis_choice3, Pos.TOP_RIGHT);
        Layout_Askisi3_sugkritis.setAlignment(btnReturn_Askisi3_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi3_sugkritis.setAlignment(help_Askisi3_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi3_sugkritis_Solution.setAlignment(btnReturn_Askisi3_sugkritis_Solution, Pos.TOP_LEFT);
        Layout_Askisi3_sugkritis_Solution.setAlignment(Continue_Askisi3_sugkritis, Pos.TOP_RIGHT);
        Layout_Askisi4_sugkritis.setAlignment(Askisi4_sugkritis_choice1, Pos.TOP_LEFT);
        Layout_Askisi4_sugkritis.setAlignment(Askisi4_sugkritis_choice2, Pos.TOP_CENTER);
        Layout_Askisi4_sugkritis.setAlignment(Askisi4_sugkritis_choice3_Correct, Pos.TOP_RIGHT);
        Layout_Askisi4_sugkritis.setAlignment(btnReturn_Askisi4_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi4_sugkritis.setAlignment(help_Askisi4_sugkritis, Pos.TOP_LEFT);
        Layout_Askisi4_sugkritis_Solution.setAlignment(btnReturn_Askisi4_sugkritis_Solution, Pos.TOP_CENTER);
        
        btnReturnMine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
            }
        });
        btnReturnOnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnLearn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rootLearn.translateYProperty().set(scene.getHeight());

                Timeline timeline = new Timeline();
                KeyValue kv = new KeyValue(rootLearn.translateYProperty(), 0, Interpolator.EASE_OUT);
                KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
                timeline.getKeyFrames().add(kf);
                primaryStage.setScene(sceneLearn);
                timeline.play();
            }
        });
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootAdd);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneAdd);
            }
        });
        btnMultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
            }
        });
        btnReturnOnMultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(root);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(scene);
                rootAdd.getChildren().removeAll(t, btnNext);
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_prosthesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneAddFirst);
            }
        });
        Continue_Askisi2_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi3_prosthesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneAddSecond);
            }
        });
        Continue_Askisi3_prosthesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_prosthesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneAddThird);
            }
        });
        btnAddCorrentAnswerOnFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AudioClip sEffect = new AudioClip(this.getClass().getResource("clap.mp3").toExternalForm());
                sEffect.setVolume(0.35);
                Path path = new Path();
                path.getElements().add(new MoveTo(535, 370));
                path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
                path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 850, 350));
                PathTransition pathTransition = new PathTransition();
                pathTransition.setDuration(Duration.millis(2500));
                pathTransition.setPath(path);
                pathTransition.setNode(btnAddCorrentAnswerOnFirst);
                pathTransition.setOrientation(PathTransition.OrientationType.NONE);
                pathTransition.setCycleCount(1);
                pathTransition.play();
                sEffect.play();

                pathTransition.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        rootAdd.getChildren().addAll(t, btnNext);
                    }

                });
            }
        });

        //Scene, Stages
        rootMultiply.getChildren().addAll(imageView4, titleMultiply, btnReturnOnMultiply, btnMultiplySelect1, btnMultiplySelect2, btnMultiplySelect3, btnMultiplySelect4, btnMultiplySelect5,
                btnMultiplySelect6, btnMultiplySelect7, btnMultiplySelect8, btnMultiplySelect9, btnMultiplySelect10);
        rootAdd.getChildren().addAll(imageView3, titleAdd, btnReturnOnAdd, text, text2, text3, text4, btnAdd1, btnAddCorrentAnswerOnFirst, btnAdd3);
        rootLearn.getChildren().addAll(imageView2, btnStartAddVideo, titleLearn, btnStartMinusVideo, btnStartCompareVideo, btnStartMultiVideo, btnStartDivideVideo, btnReturnMine);
        root.getChildren().addAll(imageView, title, menuBox, line);

        primaryStage.setTitle("Μαθηματικά Β δημοτικού");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
