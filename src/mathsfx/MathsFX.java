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
    private Pane rootAdd = new Pane();
    private VBox menuBox = new VBox(-5);
    private Line line;
    Scene scene = new Scene(root, WIDTH, HEIGHT);
    Scene sceneLearn = new Scene(rootLearn, WIDTH, HEIGHT);
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
    private Button Return_Askisi2_prosthesi = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi2_prosthesi_Solution = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi3_prosthesi = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi3_prosthesi_Solution = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button Return_Askisi4_prosthesi = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button btnReturn6 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    private Button btnNext = new CreateReturnButton("         Επόμενη ->        ", 975, 670);
    private Button Number61_Askisi2_prosthesi = new CreateButtonsAdd("/Number_61.jpg",230,20); 
    private Button Number77_Askisi2_Prosthesi = new CreateButtonsAdd("/Number_77.jpg", 10 , 20);
    private Button Number55_Askisi2_prosthesi = new CreateButtonsAdd("/Number_55.jpg", -230, 20);
    private Button Number5_Askisi3_prosthesi = new CreateButtonsAdd("/Number_5.jpg", 230, 20);
    private Button Number9_Askisi3_prosthesi = new CreateButtonsAdd("/Number_9.jpg", 10, 20);
    private Button Number7_Askisi3_prosthesi = new CreateButtonsAdd("/Number_7.jpg", -230, 20);
    private Button Number65_Askisi4_prosthesi = new CreateButtonsAddWithMinWidth("/Number_65(cube).png", 230, 30, 133, 146);
    private Button Number49_Askisi4_prosthesi = new CreateButtonsAddWithMinWidth("/Number_49(cube).png", 10, 30, 133, 146);
    private Button Number70_Askisi4_prosthesi = new CreateButtonsAddWithMinWidth("/Number_70(cube).png", -230, 30, 133, 146);
    //Buttons for VideoPlayer
    private Button btnStart = new CreateButton("         Πρόσθεση          ", 210, 650, 0);
    private Button btnStart2 = new CreateButton("         Αφαίρεση          ", 370, 650, 0);
    private Button btnStart3 = new CreateButton("         Σύγκριση          ", 525, 650, 0);
    private Button btnStart4 = new CreateButton("         Πολλαπλασιασμός         ", 680, 650, 0);
    private Button btnStart5 = new CreateButton("         Διαίρεση          ", 880, 650, 0);
    //Buttons for Answers
    private Button btnAdd1 = new CreateButtonAnswers("30", 390, 450);
    private Button btnAddCorrentAnswerOnFirst = new CreateButtonAnswers("27", 535, 450);
    private Button btnAdd3 = new CreateButtonAnswers("18", 670, 450);

    //Texts For Numbers
    private Text text = new CreateTextForNumbers(390, 370, "15", Color.RED, 70);
    private Text text2 = new CreateTextForNumbers(540, 370, "+", Color.RED, 70);
    private Text text3 = new CreateTextForNumbers(650, 370, "12", Color.RED, 70);
    private Text text4 = new CreateTextForNumbers(750, 370, "=", Color.RED, 70);

    //Αλεξ
    Button help_Askisi2_prosthesi = new CreateHelpButton(170, 0);
    Button Continue_Askisi2_prosthesi = new Button("         Συνέχεια ->        ");
    Button Continue_Askisi3_prosthesi = new Button("         Συνέχεια ->         ");

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

        //Button Actions
        btnExit.setOnAction(e -> Platform.exit());
        btnStart.setOnAction(e -> startAdd());
        btnStart2.setOnAction(e -> startMinus());
        btnStart3.setOnAction(e -> startCompare());
        btnStart4.setOnAction(e -> startMulti());
        btnStart5.setOnAction(e -> startDivide());

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
        Continue_Askisi2_prosthesi.setSkin(new MyButtonSkin(Continue_Askisi2_prosthesi));
        Continue_Askisi3_prosthesi.setSkin(new MyButtonSkin(Continue_Askisi3_prosthesi));

        //Askisi4 Solution
        Askisi3_prosthesi_Solution = new ImageView(Askisi3_prosthesi_Image_Solution);
        

        StackPane Layout_Askisi2_prosthesi = new StackPane();
        StackPane Layout_Askisi2_prosthesi_Solution = new StackPane();
        StackPane Layout_Askisi3_prosthesi = new StackPane();
        StackPane Layout_Askisi3_prosthesi_Solution = new StackPane();
        StackPane Layout_Askisi4_prosthesi = new StackPane();
        StackPane Layout_Askisi4_prosthesi_Solution = new StackPane();
        
        //CSS for Συνέχεια button
        Continue_Askisi2_prosthesi.getStylesheets().add(getClass().getResource("btnAnswers.css").toExternalForm());
        Continue_Askisi3_prosthesi.getStylesheets().add(getClass().getResource("btnAnswers.css").toExternalForm());

        Layout_Askisi2_prosthesi.getChildren().addAll(Askisi1_prosthesi, Number61_Askisi2_prosthesi, Number77_Askisi2_Prosthesi, Number55_Askisi2_prosthesi, Return_Askisi2_prosthesi, help_Askisi2_prosthesi);
        Layout_Askisi2_prosthesi_Solution.getChildren().addAll(ScaleSolution, Return_Askisi2_prosthesi_Solution, Continue_Askisi2_prosthesi);
        Layout_Askisi3_prosthesi.getChildren().addAll(Askisi2_prosthesi, Number5_Askisi3_prosthesi, Number9_Askisi3_prosthesi, Number7_Askisi3_prosthesi, Return_Askisi3_prosthesi, help_Askisi3_prosthesi);
        Layout_Askisi3_prosthesi_Solution.getChildren().addAll(Askisi2_prosthesi_Solution, Return_Askisi3_prosthesi_Solution, Continue_Askisi3_prosthesi);
        Layout_Askisi4_prosthesi.getChildren().addAll(Askisi3_prosthesi, Number65_Askisi4_prosthesi, Number49_Askisi4_prosthesi, Number70_Askisi4_prosthesi, help_Askisi4_prosthesi, Return_Askisi4_prosthesi);
        Layout_Askisi4_prosthesi_Solution.getChildren().addAll(Askisi3_prosthesi_Solution, Return_Askisi4_prosthesi_Solution);
        
        Scene sceneAddFirst = new Scene(Layout_Askisi2_prosthesi, 1164, 365);
        Scene sceneAddFirstCorrect = new Scene(Layout_Askisi2_prosthesi_Solution, 1164, 365);
        Scene sceneAddSecond = new Scene(Layout_Askisi3_prosthesi, 1164, 365);
        Scene sceneAddSecondCorrect = new Scene(Layout_Askisi3_prosthesi_Solution, 1164, 365);
        Scene sceneAddThird = new Scene(Layout_Askisi4_prosthesi, 1164, 600);
        Scene sceneAddThirdCorrect = new Scene(Layout_Askisi4_prosthesi_Solution, 1164, 600);
        
        Number61_Askisi2_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπαντηση", "Ξαναπροσπάθησε!"));
        Number55_Askisi2_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπαντηση", "Ξαναπροσπάθησε!"));
        help_Askisi2_prosthesi.setOnAction(e -> Help.display("Βοήθεια", Scale));
        Continue_Askisi2_prosthesi.setOnAction(e -> Window.setScene(sceneAddSecond));
        Number77_Askisi2_Prosthesi.setOnAction(e -> Window.setScene(sceneAddFirstCorrect));
        Number9_Askisi3_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπαντηση", "Ξαναπροσπάθησε!"));
        Number5_Askisi3_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπαντηση", "Ξαναπροσπάθησε!"));
        //btnReturn3.setOnAction(e -> Window.setScene(scene));
        help_Askisi3_prosthesi.setOnAction(e -> Help2.display("Βοήθεια", "Το κάθε δάχτυλο είναι μια μονάδα!"));
        //btnReturn4.setOnAction(e -> Window.setScene(scene));
        Number7_Askisi3_prosthesi.setOnAction(e -> Window.setScene(sceneAddSecondCorrect));
        Continue_Askisi3_prosthesi.setOnAction(e -> Window.setScene(sceneAddThird));
        Number49_Askisi4_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπαντηση", "Ξαναπροσπάθησε!"));
        Number70_Askisi4_prosthesi.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπαντηση", "Ξαναπροσπάθησε!"));
        Number65_Askisi4_prosthesi.setOnAction(e -> Window.setScene(sceneAddThirdCorrect));
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
        Return_Askisi2_prosthesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
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

        btnAddCorrentAnswerOnFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
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

                pathTransition.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        rootAdd.getChildren().addAll(t, btnNext);
                    }

                });
            }
        });

        //Scene, Stages
        rootAdd.getChildren().addAll(imageView3, titleAdd, btnReturnOnAdd, text, text2, text3, text4, btnAdd1, btnAddCorrentAnswerOnFirst, btnAdd3);
        rootLearn.getChildren().addAll(imageView2, btnStart, titleLearn, btnStart2, btnStart3, btnStart4, btnStart5, btnReturnMine);
        root.getChildren().addAll(imageView, title, menuBox, line);

        primaryStage.setTitle("Μαθηματικά Β δημοτικού");
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
