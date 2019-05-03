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
import javafx.scene.CacheHint;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

    private int counter = 0;
    private Player player;
    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;
    double lineX = WIDTH / 2 - 100;
    double lineY = HEIGHT / 3 + 50;
    private Pane root = new Pane();
    private Pane rootLearn = new Pane();
    private Pane rootMultiply = new Pane();
    //Multiply for 1
    private Pane rootMultiply1 = new Pane();
    private Pane rootMultiply1Second = new Pane();
    private Pane rootMultiply1Third = new Pane();
    private Pane rootMultiply1Fourth = new Pane();
    private Pane rootMultiply1Fifth = new Pane();
    private Pane rootMultiply1FinalPane = new Pane();
    //Multiply for 1 ends here
    //Multiply for 2
    private Pane rootMultiply2 = new Pane();
    private Pane rootMultiply2Second = new Pane();
    private Pane rootMultiply2Third = new Pane();
    private Pane rootMultiply2Fourth = new Pane();
    private Pane rootMultiply2Fifth = new Pane();
    private Pane rootMultiply2Final = new Pane();
    //Multiplay for 2 ends here
    //Multiply for 3 
    private Pane rootMultiply3 = new Pane();
    private Pane rootMultiply3Second = new Pane();
    private Pane rootMultiply3Third = new Pane();
    private Pane rootMultiply3Fourth = new Pane();
    private Pane rootMultiply3Fifth = new Pane();
    private Pane rootMultiply3Final = new Pane();
    //Multiply for 4
    private Pane rootMultiply4 = new Pane();
    private Pane rootMultiply4Second = new Pane();
    private Pane rootMultiply4Third = new Pane();
    private Pane rootMultiply4Fourth = new Pane();
    private Pane rootMultiply4Fifth = new Pane();
    private Pane rootMultiply4Final = new Pane();
    //Multiply for 5
    private Pane rootMultiply5 = new Pane();
    private Pane rootMultiply5Second = new Pane();
    private Pane rootMultiply5Third = new Pane();
    private Pane rootMultiply5Fourth = new Pane();
    private Pane rootMultiply5Fifth = new Pane();
    private Pane rootMultiply5Final = new Pane();
    //Multiply for 6
    private Pane rootMultiply6 = new Pane();
    private Pane rootMultiply6Second = new Pane();
    private Pane rootMultiply6Third = new Pane();
    private Pane rootMultiply6Fourth = new Pane();
    private Pane rootMultiply6Fifth = new Pane();
    private Pane rootMultiply6Final = new Pane();
    //Multiply for 7
    private Pane rootMultiply7 = new Pane();
    private Pane rootMultiply7Second = new Pane();
    private Pane rootMultiply7Third = new Pane();
    private Pane rootMultiply7Fourth = new Pane();
    private Pane rootMultiply7Fifth = new Pane();
    private Pane rootMultiply7Final = new Pane();
    //Multiply for 8
    private Pane rootMultiply8 = new Pane();
    private Pane rootMultiply8Second = new Pane();
    private Pane rootMultiply8Third = new Pane();
    private Pane rootMultiply8Fourth = new Pane();
    private Pane rootMultiply8Fifth = new Pane();
    private Pane rootMultiply8Final = new Pane();
    //Multiply for 9
    private Pane rootMultiply9 = new Pane();
    private Pane rootMultiply9Second = new Pane();
    private Pane rootMultiply9Third = new Pane();
    private Pane rootMultiply9Fourth = new Pane();
    private Pane rootMultiply9Fifth = new Pane();
    private Pane rootMultiply9Final = new Pane();
    //Multiply for 10
    private Pane rootMultiply10 = new Pane();
    private Pane rootMultiply10Second = new Pane();
    private Pane rootMultiply10Third = new Pane();
    private Pane rootMultiply10Fourth = new Pane();
    private Pane rootMultiply10Fifth = new Pane();
    private Pane rootMultiply10Final = new Pane();

    private Pane rootAdd = new Pane();
    private VBox menuBox = new VBox(-5);
    private Line line;
    Scene scene = new Scene(root, WIDTH, HEIGHT);
    Scene sceneLearn = new Scene(rootLearn, WIDTH, HEIGHT);
    Scene sceneMultiply = new Scene(rootMultiply, WIDTH, HEIGHT);
    //Multiply for 1
    Scene sceneMultiply1 = new Scene(rootMultiply1, WIDTH, HEIGHT);
    Scene sceneMultiply1Second = new Scene(rootMultiply1Second, WIDTH, HEIGHT);
    Scene sceneMultiply1Third = new Scene(rootMultiply1Third, WIDTH, HEIGHT);
    Scene sceneMultiply1Fourth = new Scene(rootMultiply1Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply1Fifth = new Scene(rootMultiply1Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply1Final = new Scene(rootMultiply1FinalPane, WIDTH, HEIGHT);
    //Multiply for 1 ends here
    //Multiplay for 2 
    Scene sceneMultiply2 = new Scene(rootMultiply2, WIDTH, HEIGHT);
    Scene sceneMultiply2Second = new Scene(rootMultiply2Second, WIDTH, HEIGHT);
    Scene sceneMultiply2Third = new Scene(rootMultiply2Third, WIDTH, HEIGHT);
    Scene sceneMultiply2Fourth = new Scene(rootMultiply2Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply2Fifth = new Scene(rootMultiply2Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply2Final = new Scene(rootMultiply2Final, WIDTH, HEIGHT);
    //Multiply for 3
    Scene sceneMultiply3 = new Scene(rootMultiply3, WIDTH, HEIGHT);
    Scene sceneMultiply3Second = new Scene(rootMultiply3Second, WIDTH, HEIGHT);
    Scene sceneMultiply3Third = new Scene(rootMultiply3Third, WIDTH, HEIGHT);
    Scene sceneMultiply3Fourth = new Scene(rootMultiply3Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply3Fifth = new Scene(rootMultiply3Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply3Final = new Scene(rootMultiply3Final, WIDTH, HEIGHT);
    //Multiply for 4
    Scene sceneMultiply4 = new Scene(rootMultiply4, WIDTH, HEIGHT);
    Scene sceneMultiply4Second = new Scene(rootMultiply4Second, WIDTH, HEIGHT);
    Scene sceneMultiply4Third = new Scene(rootMultiply4Third, WIDTH, HEIGHT);
    Scene sceneMultiply4Fourth = new Scene(rootMultiply4Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply4Fifth = new Scene(rootMultiply4Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply4Final = new Scene(rootMultiply4Final, WIDTH, HEIGHT);
    //Multiply for 5
    Scene sceneMultiply5 = new Scene(rootMultiply5, WIDTH, HEIGHT);
    Scene sceneMultiply5Second = new Scene(rootMultiply5Second, WIDTH, HEIGHT);
    Scene sceneMultiply5Third = new Scene(rootMultiply5Third, WIDTH, HEIGHT);
    Scene sceneMultiply5Fourth = new Scene(rootMultiply5Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply5Fifth = new Scene(rootMultiply5Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply5Final = new Scene(rootMultiply5Final, WIDTH, HEIGHT);
    //Multiply for 6
    Scene sceneMultiply6 = new Scene(rootMultiply6, WIDTH, HEIGHT);
    Scene sceneMultiply6Second = new Scene(rootMultiply6Second, WIDTH, HEIGHT);
    Scene sceneMultiply6Third = new Scene(rootMultiply6Third, WIDTH, HEIGHT);
    Scene sceneMultiply6Fourth = new Scene(rootMultiply6Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply6Fifth = new Scene(rootMultiply6Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply6Final = new Scene(rootMultiply6Final, WIDTH, HEIGHT);
    //Multiply for 7
    Scene sceneMultiply7 = new Scene(rootMultiply7, WIDTH, HEIGHT);
    Scene sceneMultiply7Second = new Scene(rootMultiply7Second, WIDTH, HEIGHT);
    Scene sceneMultiply7Third = new Scene(rootMultiply7Third, WIDTH, HEIGHT);
    Scene sceneMultiply7Fourth = new Scene(rootMultiply7Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply7Fifth = new Scene(rootMultiply7Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply7Final = new Scene(rootMultiply7Final, WIDTH, HEIGHT);
    //Multiply for 8
    Scene sceneMultiply8 = new Scene(rootMultiply8, WIDTH, HEIGHT);
    Scene sceneMultiply8Second = new Scene(rootMultiply8Second, WIDTH, HEIGHT);
    Scene sceneMultiply8Third = new Scene(rootMultiply8Third, WIDTH, HEIGHT);
    Scene sceneMultiply8Fourth = new Scene(rootMultiply8Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply8Fifth = new Scene(rootMultiply8Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply8Final = new Scene(rootMultiply8Final, WIDTH, HEIGHT);
    //Multiply for 9
    Scene sceneMultiply9 = new Scene(rootMultiply9, WIDTH, HEIGHT);
    Scene sceneMultiply9Second = new Scene(rootMultiply9Second, WIDTH, HEIGHT);
    Scene sceneMultiply9Third = new Scene(rootMultiply9Third, WIDTH, HEIGHT);
    Scene sceneMultiply9Fourth = new Scene(rootMultiply9Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply9Fifth = new Scene(rootMultiply9Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply9Final = new Scene(rootMultiply9Final, WIDTH, HEIGHT);
    //Multiply for 10
    Scene sceneMultiply10 = new Scene(rootMultiply10, WIDTH, HEIGHT);
    Scene sceneMultiply10Second = new Scene(rootMultiply10Second, WIDTH, HEIGHT);
    Scene sceneMultiply10Third = new Scene(rootMultiply10Third, WIDTH, HEIGHT);
    Scene sceneMultiply10Fourth = new Scene(rootMultiply10Fourth, WIDTH, HEIGHT);
    Scene sceneMultiply10Fifth = new Scene(rootMultiply10Fifth, WIDTH, HEIGHT);
    Scene sceneMultiply10Final = new Scene(rootMultiply10Final, WIDTH, HEIGHT);

    Scene sceneAdd = new Scene(rootAdd, WIDTH - 135, HEIGHT);

    //Buttons of MainMenu
    private Button btnLearn = new CreateButton("      Εκμάθηση         ", lineX + 10, lineY, -2);
    private Button btnAdd = new CreateButton("       Πρόσθεση        ", lineX + 10, lineY + 10, -2);
    private Button btnMinus = new CreateButton("       Αφαίρεση         ", lineX + 10, lineY + 20, -2);
    private Button btnCompare = new CreateButton("        Σύγκριση         ", lineX + 10, lineY + 30, -2);
    private Button btnMultiply = new CreateButton(" Πολλαπλασιασμός ", lineX + 10, lineY + 40, -2);
    private Button btnDivide = new CreateButton("        Διαίρεση         ", lineX + 10, lineY + 50, -2);
    private Button btnExit = new CreateButton("         Εξόδος          ", lineX + 10, lineY + 60, -2);
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
    //Multiply for 1
    private Button btnMultiplySelect1 = new CreateButtonAnswersMultiply("1", 200, 350, 1.5, 1.5);
    private Button btnMultiplyFirstEx1 = new CreateButtonAnswers("7", 390, 450, 1, 1);
    private Button btnMultiplyFirstEx2 = new CreateButtonAnswers("4", 590, 450, 1, 1);
    private Button btnMultiplyFirstEx3 = new CreateButtonAnswers("9", 790, 450, 1, 1);
    //Second Ex
    private Button btnMultiplyFirstEx1Second = new CreateButtonAnswers("6", 390, 450, 1, 1);
    private Button btnMultiplyFirstEx2Second = new CreateButtonAnswers("8", 590, 450, 1, 1);
    private Button btnMultiplyFirstEx3Second = new CreateButtonAnswers("4", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyFirstEx1Third = new CreateButtonAnswers("2", 390, 450, 1, 1);
    private Button btnMultiplyFirstEx2Third = new CreateButtonAnswers("10", 590, 450, 1, 1);
    private Button btnMultiplyFirstEx3Third = new CreateButtonAnswers("3", 790, 450, 1, 1);
    //Fourth Ex
    private Button btnMultiplyFirstEx1Fourth = new CreateButtonAnswers("8", 390, 450, 1, 1);
    private Button btnMultiplyFirstEx2Fourth = new CreateButtonAnswers("4", 590, 450, 1, 1);
    private Button btnMultiplyFirstEx3Fourth = new CreateButtonAnswers("5", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyFirstEx1Fifth = new CreateButtonAnswers("7", 390, 450, 1, 1);
    private Button btnMultiplyFirstEx2Fifth = new CreateButtonAnswers("3", 590, 450, 1, 1);
    private Button btnMultiplyFirstEx3Fifth = new CreateButtonAnswers("5", 790, 450, 1, 1);

    //Returns
    Button Return_Askisi1_multiply1 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply1Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply1Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply1Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply1Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply1Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    //Multiply for 1 ends here

    //Multiply for 2
    private Button btnMultiplySelect2 = new CreateButtonAnswersMultiply("2", 400, 350, 1.5, 1.5);
    private Button btnMultiplySecondEx1 = new CreateButtonAnswers("12", 390, 450, 1, 1);
    private Button btnMultiplySecondEx2 = new CreateButtonAnswers("14", 590, 450, 1, 1);
    private Button btnMultiplySecondEx3 = new CreateButtonAnswers("18", 790, 450, 1, 1);
    //Second Ex
    private Button btnMultiplySecondEx1Second = new CreateButtonAnswers("10", 390, 450, 1, 1);
    private Button btnMultiplySecondEx2Second = new CreateButtonAnswers("16", 590, 450, 1, 1);
    private Button btnMultiplySecondEx3Second = new CreateButtonAnswers("20", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplySecondEx1Third = new CreateButtonAnswers("6", 390, 450, 1, 1);
    private Button btnMultiplySecondEx2Third = new CreateButtonAnswers("8", 590, 450, 1, 1);
    private Button btnMultiplySecondEx3Third = new CreateButtonAnswers("2", 790, 450, 1, 1);
    //Fourth Ex
    private Button btnMultiplySecondEx1Fourth = new CreateButtonAnswers("8", 390, 450, 1, 1);
    private Button btnMultiplySecondEx2Fourth = new CreateButtonAnswers("12", 590, 450, 1, 1);
    private Button btnMultiplySecondEx3Fourth = new CreateButtonAnswers("14", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplySecondEx1Fifth = new CreateButtonAnswers("4", 390, 450, 1, 1);
    private Button btnMultiplySecondEx2Fifth = new CreateButtonAnswers("6", 590, 450, 1, 1);
    private Button btnMultiplySecondEx3Fifth = new CreateButtonAnswers("22", 790, 450, 1, 1);

    //Returns
    Button Return_Askisi1_multiply2 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply2Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply2Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply2Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply2Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply2Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    //Multiply for 2 ends here
    //Multiply for 3
    private Button btnMultiplySelect3 = new CreateButtonAnswersMultiply("3", 600, 350, 1.5, 1.5);
    private Button btnMultiplyThirdEx1 = new CreateButtonAnswers("9", 390, 450, 1, 1);
    private Button btnMultiplyThirdEx2 = new CreateButtonAnswers("12", 590, 450, 1, 1);
    private Button btnMultiplyThirdEx3 = new CreateButtonAnswers("15", 790, 450, 1, 1); //3rd Correct
    //Second Ex
    private Button btnMultiplyThirdEx1Second = new CreateButtonAnswers("6", 390, 450, 1, 1);
    private Button btnMultiplyThirdEx2Second = new CreateButtonAnswers("21", 590, 450, 1, 1); //2nd correct
    private Button btnMultiplyThirdEx3Second = new CreateButtonAnswers("3", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyThirdEx1Third = new CreateButtonAnswers("18", 390, 450, 1, 1);
    private Button btnMultiplyThirdEx2Third = new CreateButtonAnswers("9", 590, 450, 1, 1);
    private Button btnMultiplyThirdEx3Third = new CreateButtonAnswers("30", 790, 450, 1, 1); //3rd correct
    //Fourth Ex
    private Button btnMultiplyThirdEx1Fourth = new CreateButtonAnswers("24", 390, 450, 1, 1); //1st correct
    private Button btnMultiplyThirdEx2Fourth = new CreateButtonAnswers("6", 590, 450, 1, 1);
    private Button btnMultiplyThirdEx3Fourth = new CreateButtonAnswers("26", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyThirdEx1Fifth = new CreateButtonAnswers("15", 390, 450, 1, 1);
    private Button btnMultiplyThirdEx2Fifth = new CreateButtonAnswers("13", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplyThirdEx3Fifth = new CreateButtonAnswers("18", 790, 450, 1, 1);
    //Returns
    Button Return_Askisi1_multiply3 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply3Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply3Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply3Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply3Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply3Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    //Multiply for 4
    private Button btnMultiplySelect4 = new CreateButtonAnswersMultiply("4", 800, 350, 1.5, 1.5);
    private Button btnMultiplyFourthEx1 = new CreateButtonAnswers("25", 390, 450, 1, 1);
    private Button btnMultiplyFourthEx2 = new CreateButtonAnswers("12", 590, 450, 1, 1);
    private Button btnMultiplyFourthEx3 = new CreateButtonAnswers("16", 790, 450, 1, 1); //3rd Correct
    //Second Ex
    private Button btnMultiplyFourthEx1Second = new CreateButtonAnswers("24", 390, 450, 1, 1);
    private Button btnMultiplyFourthEx2Second = new CreateButtonAnswers("40", 590, 450, 1, 1); //2nd correct
    private Button btnMultiplyFourthEx3Second = new CreateButtonAnswers("14", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyFourthEx1Third = new CreateButtonAnswers("18", 390, 450, 1, 1);
    private Button btnMultiplyFourthEx2Third = new CreateButtonAnswers("9", 590, 450, 1, 1);
    private Button btnMultiplyFourthEx3Third = new CreateButtonAnswers("32", 790, 450, 1, 1); //3rd correct
    //Fourth Ex
    private Button btnMultiplyFourthEx1Fourth = new CreateButtonAnswers("36", 390, 450, 1, 1); //1st correct
    private Button btnMultiplyFourthEx2Fourth = new CreateButtonAnswers("17", 590, 450, 1, 1);
    private Button btnMultiplyFourthEx3Fourth = new CreateButtonAnswers("12", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyFourthEx1Fifth = new CreateButtonAnswers("18", 390, 450, 1, 1);
    private Button btnMultiplyFourthEx2Fifth = new CreateButtonAnswers("13", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplyFourthEx3Fifth = new CreateButtonAnswers("28", 790, 450, 1, 1);
    //Returns
    Button Return_Askisi1_multiply4 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply4Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply4Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply4Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply4Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply4Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);

    //Multiply for 5
    private Button btnMultiplySelect5 = new CreateButtonAnswersMultiply("5", 1000, 350, 1.5, 1.5);
    private Button btnMultiplyFifthEx1 = new CreateButtonAnswers("15", 390, 450, 1, 1);
    private Button btnMultiplyFifthEx2 = new CreateButtonAnswers("10", 590, 450, 1, 1);
    private Button btnMultiplyFifthEx3 = new CreateButtonAnswers("25", 790, 450, 1, 1); //3rd Correct
    //Second Ex
    private Button btnMultiplyFifthEx1Second = new CreateButtonAnswers("45", 390, 450, 1, 1);
    private Button btnMultiplyFifthEx2Second = new CreateButtonAnswers("50", 590, 450, 1, 1); //2nd correct
    private Button btnMultiplyFifthEx3Second = new CreateButtonAnswers("5", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyFifthEx1Third = new CreateButtonAnswers("25", 390, 450, 1, 1);
    private Button btnMultiplyFifthEx2Third = new CreateButtonAnswers("35", 590, 450, 1, 1);
    private Button btnMultiplyFifthEx3Third = new CreateButtonAnswers("20", 790, 450, 1, 1); //3rd correct
    //Fourth Ex
    private Button btnMultiplyFifthEx1Fourth = new CreateButtonAnswers("15", 390, 450, 1, 1); //1st correct
    private Button btnMultiplyFifthEx2Fourth = new CreateButtonAnswers("5", 590, 450, 1, 1);
    private Button btnMultiplyFifthEx3Fourth = new CreateButtonAnswers("55", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyFifthEx1Fifth = new CreateButtonAnswers("44", 390, 450, 1, 1);
    private Button btnMultiplyFifthEx2Fifth = new CreateButtonAnswers("13", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplyFifthEx3Fifth = new CreateButtonAnswers("5", 790, 450, 1, 1);
    //Returns
    Button Return_Askisi1_multiply5 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply5Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply5Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply5Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply5Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply5Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    //Multiply for 6
    private Button btnMultiplySelect6 = new CreateButtonAnswersMultiply("6", 300, 450, 1.5, 1.5);
    private Button btnMultiplySixthEx1 = new CreateButtonAnswers("36", 390, 450, 1, 1);
    private Button btnMultiplySixthEx2 = new CreateButtonAnswers("48", 590, 450, 1, 1);
    private Button btnMultiplySixthEx3 = new CreateButtonAnswers("46", 790, 450, 1, 1); //1rd Correct
    //Second Ex
    private Button btnMultiplySixthEx1Second = new CreateButtonAnswers("46", 390, 450, 1, 1);
    private Button btnMultiplySixthEx2Second = new CreateButtonAnswers("54", 590, 450, 1, 1); //2nd correct
    private Button btnMultiplySixthEx3Second = new CreateButtonAnswers("32", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplySixthEx1Third = new CreateButtonAnswers("12", 390, 450, 1, 1);
    private Button btnMultiplySixthEx2Third = new CreateButtonAnswers("18", 590, 450, 1, 1);
    private Button btnMultiplySixthEx3Third = new CreateButtonAnswers("30", 790, 450, 1, 1); //3rd correct
    //Fourth Ex
    private Button btnMultiplySixthEx1Fourth = new CreateButtonAnswers("24", 390, 450, 1, 1); //1st correct
    private Button btnMultiplySixthEx2Fourth = new CreateButtonAnswers("22", 590, 450, 1, 1);
    private Button btnMultiplySixthEx3Fourth = new CreateButtonAnswers("26", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplySixthEx1Fifth = new CreateButtonAnswers("44", 390, 450, 1, 1);
    private Button btnMultiplySixthEx2Fifth = new CreateButtonAnswers("13", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplySixthEx3Fifth = new CreateButtonAnswers("42", 790, 450, 1, 1);
    //Returns
    Button Return_Askisi1_multiply6 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply6Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply6Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply6Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply6Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply6Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);

    //Multiply for 7
    private Button btnMultiplySelect7 = new CreateButtonAnswersMultiply("7", 500, 450, 1.5, 1.5);
    private Button btnMultiplySeventhEx1 = new CreateButtonAnswers("70", 390, 450, 1, 1);
    private Button btnMultiplySeventhEx2 = new CreateButtonAnswers("55", 590, 450, 1, 1);
    private Button btnMultiplySeventhEx3 = new CreateButtonAnswers("66", 790, 450, 1, 1); //1rd Correct
    //Second Ex
    private Button btnMultiplySeventhEx1Second = new CreateButtonAnswers("42", 390, 450, 1, 1);
    private Button btnMultiplySeventhEx2Second = new CreateButtonAnswers("52", 590, 450, 1, 1); //1nd correct
    private Button btnMultiplySeventhEx3Second = new CreateButtonAnswers("32", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplySeventhEx1Third = new CreateButtonAnswers("14", 390, 450, 1, 1);
    private Button btnMultiplySeventhEx2Third = new CreateButtonAnswers("18", 590, 450, 1, 1);
    private Button btnMultiplySeventhEx3Third = new CreateButtonAnswers("28", 790, 450, 1, 1); //3rd correct
    //Fourth Ex
    private Button btnMultiplySeventhEx1Fourth = new CreateButtonAnswers("56", 390, 450, 1, 1); //1st correct
    private Button btnMultiplySeventhEx2Fourth = new CreateButtonAnswers("46", 590, 450, 1, 1);
    private Button btnMultiplySeventhEx3Fourth = new CreateButtonAnswers("58", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplySeventhEx1Fifth = new CreateButtonAnswers("45", 390, 450, 1, 1);
    private Button btnMultiplySeventhEx2Fifth = new CreateButtonAnswers("40", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplySeventhEx3Fifth = new CreateButtonAnswers("35", 790, 450, 1, 1);
    //Returns 7
    Button Return_Askisi1_multiply7 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply7Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply7Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply7Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply7Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply7Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);

    //Multiply for 8
    private Button btnMultiplySelect8 = new CreateButtonAnswersMultiply("8", 700, 450, 1.5, 1.5);
    private Button btnMultiplyEightEx1 = new CreateButtonAnswers("74", 390, 450, 1, 1);
    private Button btnMultiplyEightEx2 = new CreateButtonAnswers("56", 590, 450, 1, 1);
    private Button btnMultiplyEightEx3 = new CreateButtonAnswers("72", 790, 450, 1, 1); //3rd Correct
    //Second Ex
    private Button btnMultiplyEightEx1Second = new CreateButtonAnswers("64", 390, 450, 1, 1);
    private Button btnMultiplyEightEx2Second = new CreateButtonAnswers("44", 590, 450, 1, 1); //1nd correct
    private Button btnMultiplyEightEx3Second = new CreateButtonAnswers("55", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyEightEx1Third = new CreateButtonAnswers("58", 390, 450, 1, 1);
    private Button btnMultiplyEightEx2Third = new CreateButtonAnswers("48", 590, 450, 1, 1);
    private Button btnMultiplyEightEx3Third = new CreateButtonAnswers("28", 790, 450, 1, 1); //2rd correct
    //Fourth Ex
    private Button btnMultiplyEightEx1Fourth = new CreateButtonAnswers("80", 390, 450, 1, 1); //1st correct
    private Button btnMultiplyEightEx2Fourth = new CreateButtonAnswers("46", 590, 450, 1, 1);
    private Button btnMultiplyEightEx3Fourth = new CreateButtonAnswers("58", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyEightEx1Fifth = new CreateButtonAnswers("14", 390, 450, 1, 1);
    private Button btnMultiplyEightEx2Fifth = new CreateButtonAnswers("26", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplyEightEx3Fifth = new CreateButtonAnswers("16", 790, 450, 1, 1);
    //Returns 8
    Button Return_Askisi1_multiply8 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply8Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply8Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply8Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply8Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply8Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    //Multiply for 9
    private Button btnMultiplySelect9 = new CreateButtonAnswersMultiply("9", 900, 450, 1.5, 1.5);
    private Button btnMultiplyNineEx1 = new CreateButtonAnswers("74", 390, 450, 1, 1);
    private Button btnMultiplyNineEx2 = new CreateButtonAnswers("56", 590, 450, 1, 1);
    private Button btnMultiplyNineEx3 = new CreateButtonAnswers("81", 790, 450, 1, 1); //3rd Correct
    //Second Ex
    private Button btnMultiplyNineEx1Second = new CreateButtonAnswers("45", 390, 450, 1, 1);
    private Button btnMultiplyNineEx2Second = new CreateButtonAnswers("46", 590, 450, 1, 1); //1nd correct
    private Button btnMultiplyNineEx3Second = new CreateButtonAnswers("55", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyNineEx1Third = new CreateButtonAnswers("58", 390, 450, 1, 1);
    private Button btnMultiplyNineEx2Third = new CreateButtonAnswers("36", 590, 450, 1, 1);
    private Button btnMultiplyNineEx3Third = new CreateButtonAnswers("55", 790, 450, 1, 1); //2rd correct
    //Fourth Ex
    private Button btnMultiplyNineEx1Fourth = new CreateButtonAnswers("54", 390, 450, 1, 1); //1st correct
    private Button btnMultiplyNineEx2Fourth = new CreateButtonAnswers("46", 590, 450, 1, 1);
    private Button btnMultiplyNineEx3Fourth = new CreateButtonAnswers("58", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyNineEx1Fifth = new CreateButtonAnswers("14", 390, 450, 1, 1);
    private Button btnMultiplyNineEx2Fifth = new CreateButtonAnswers("26", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplyNineEx3Fifth = new CreateButtonAnswers("27", 790, 450, 1, 1);
    //Returns 9
    Button Return_Askisi1_multiply9 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply9Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply9Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply9Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply9Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply9Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    //Multiply for 10
    private Button btnMultiplySelect10 = new CreateButtonAnswersMultiply("10", 600, 550, 1.5, 1.5);
    private Button btnMultiplyTenEx1 = new CreateButtonAnswers("70", 390, 450, 1, 1);
    private Button btnMultiplyTenEx2 = new CreateButtonAnswers("56", 590, 450, 1, 1);
    private Button btnMultiplyTenEx3 = new CreateButtonAnswers("50", 790, 450, 1, 1); //3rd Correct
    //Second Ex
    private Button btnMultiplyTenEx1Second = new CreateButtonAnswers("100", 390, 450, 1, 1);
    private Button btnMultiplyTenEx2Second = new CreateButtonAnswers("60", 590, 450, 1, 1); //1nd correct
    private Button btnMultiplyTenEx3Second = new CreateButtonAnswers("10", 790, 450, 1, 1);
    //Third Ex
    private Button btnMultiplyTenEx1Third = new CreateButtonAnswers("30", 390, 450, 1, 1);
    private Button btnMultiplyTenEx2Third = new CreateButtonAnswers("40", 590, 450, 1, 1);
    private Button btnMultiplyTenEx3Third = new CreateButtonAnswers("20", 790, 450, 1, 1); //2rd correct
    //Fourth Ex
    private Button btnMultiplyTenEx1Fourth = new CreateButtonAnswers("80", 390, 450, 1, 1); //1st correct
    private Button btnMultiplyTenEx2Fourth = new CreateButtonAnswers("46", 590, 450, 1, 1);
    private Button btnMultiplyTenEx3Fourth = new CreateButtonAnswers("58", 790, 450, 1, 1);
    //Fifth Ex
    private Button btnMultiplyTenEx1Fifth = new CreateButtonAnswers("1 0", 390, 450, 1, 1);
    private Button btnMultiplyTenEx2Fifth = new CreateButtonAnswers("25", 590, 450, 1, 1); //3rd correct
    private Button btnMultiplyTenEx3Fifth = new CreateButtonAnswers("20", 790, 450, 1, 1);
    //Returns 7
    Button Return_Askisi1_multiply10 = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply10Second = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply10Third = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply10Fourth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply10Fifth = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);
    Button Return_Askisi1_multiply10Final = new CreateReturnButton("   <-  Επιστροφή      ", 0, 0);

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

    //Αλεξ & Γιώργος
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

    //variables Askisi1 Diairesi
    Image Askisi1_diairesi_Image = new Image(getClass().getResourceAsStream("/Askisi1_diairesi.png"));
    ImageView Askisi1_diairesi = new ImageView(Askisi1_diairesi_Image);
    private Button Askisi1_diairesi_choice1 = new CreateButtonsAddWithMinWidthAndSize("/Askisi1_diairesi_epilogi1.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi1_diairesi_choice2_Correct = new CreateButtonsAddWithMinWidthAndSize("/Askisi1_diairesi_epilogi2.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi1_diairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi1_diairesi_epilogi3.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi1_diairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi1_diairesi = new CreateHelpButton(160, 0);
    
    //variables Askisi1 Diairesi Solution
    Image Askisi1_diairesi_Solution_image = new Image(getClass().getResourceAsStream("/Askisi1_diairesi_Solution.png"));
    ImageView Askisi1_diairesi_Solution = new ImageView(Askisi1_diairesi_Solution_image);
    private Button btnReturn_Askisi1_diairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi1_diairesi = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi2 Diairesi
    Image Askisi2_diairesi_image = new Image(getClass().getResourceAsStream("/Askisi2_diairesi.png"));
    ImageView Askisi2_diairesi = new ImageView(Askisi2_diairesi_image);
    private Button Askisi2_diairesi_choice1_Correct = new CreateButtonsAddWithMinWidthAndSize("/Askisi2_diairesi_epilogi1.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi2_diairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi2_diairesi_epilogi2.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi2_diairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi2_diairesi_epilogi3.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi2_diairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi2_diairesi = new CreateHelpButton(160, 0);
    
    //variables Askisi2 Diairesi Solution
    Image Askisi2_diairesi_Solution_image = new Image(getClass().getResourceAsStream("/Askisi2_diairesi_Solution.png"));
    ImageView Askisi2_diairesi_Solution = new ImageView(Askisi2_diairesi_Solution_image);
    private Button btnReturn_Askisi2_diairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi2_diairesi = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi3 Diairesi
    Image Askisi3_diairesi_image = new Image(getClass().getResourceAsStream("/Askisi3_diairesi.png"));
    ImageView Askisi3_diairesi = new ImageView(Askisi3_diairesi_image);
    private Button Askisi3_diairesi_choice1 = new CreateButtonsAddWithMinWidthAndSize("/Askisi3_diairesi_epilogi1.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi3_diairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi3_diairesi_epilogi2.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi3_diairesi_choice3_Correct = new CreateButtonsAddWithMinWidthAndSize("/Askisi3_diairesi_epilogi3.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi3_diairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi3_diairesi = new CreateHelpButton(160, 0);
    
    //variables Askisi3 Diairesi Solution
    Image Askisi3_diairesi_Solution_image = new Image(getClass().getResourceAsStream("/Askisi3_diairesi_Solution.png"));
    ImageView Askisi3_diairesi_Solution = new ImageView(Askisi3_diairesi_Solution_image);
    private Button btnReturn_Askisi3_diairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button Continue_Askisi3_diairesi = new ButtonForContinue("         Συνέχεια ->         ");
    
    //variables Askisi4 Diairesi
    Image Askisi4_diairesi_image = new Image(getClass().getResourceAsStream("/Askisi4_diairesi.png"));
    ImageView Askisi4_diairesi = new ImageView(Askisi4_diairesi_image);
    private Button Askisi4_diairesi_choice1_Correct = new CreateButtonsAddWithMinWidthAndSize("/Askisi4_diairesi_epilogi1.png", 230, 30, 150, 150, 150, 150);
    private Button Askisi4_diairesi_choice2 = new CreateButtonsAddWithMinWidthAndSize("/Askisi4_diairesi_epilogi2.png", 10, 30, 150, 150, 150, 150);
    private Button Askisi4_diairesi_choice3 = new CreateButtonsAddWithMinWidthAndSize("/Askisi4_diairesi_epilogi3.png", -230, 30, 150, 150, 150, 150);
    private Button btnReturn_Askisi4_diairesi = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    Button help_Askisi4_diairesi = new CreateHelpButton(160, 0);
    
    //variables Askisi4 Diairesi Solution
    Image Askisi4_diairesi_Solution_image = new Image(getClass().getResourceAsStream("/Askisi4_diairesi_Solution.png"));
    ImageView Askisi4_diairesi_Solution = new ImageView(Askisi4_diairesi_Solution_image);
    private Button btnReturn_Askisi4_diairesi_Solution = new CreateReturnButton("   <-  Επιστροφή     ", 0, 0);
    
    Stage Window;

    private void addLine(double x, double y) {
        line = new Line(x, y, x, y + 300);
        line.setStrokeWidth(3);
        line.setStroke(Color.color(1, 1, 1, 0.75));
        line.setEffect(new DropShadow(5, Color.BLACK));
        line.setScaleY(0);
    }

    public static void startAnimationButton(Button b) {
        ScaleTransition st = new ScaleTransition(Duration.millis(5000), b);
        st.setToY(1);
        st.play();
        b.setCache(true);
        b.setCacheHint(CacheHint.SPEED);
    }

    private void startAnimationLine() {
        ScaleTransition st = new ScaleTransition(Duration.millis(2900), line);
        st.setToY(1);
        st.play();
        line.setCache(true);
        line.setCacheHint(CacheHint.SPEED);

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

    public void counter() {
        counter++;

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
        //Images for Multiply panes
        ImageView imageViewMultiplyFor1First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor1First.setFitWidth(WIDTH);
        imageViewMultiplyFor1First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor1Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor1Second.setFitWidth(WIDTH);
        imageViewMultiplyFor1Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor1Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor1Third.setFitWidth(WIDTH);
        imageViewMultiplyFor1Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor1Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor1Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor1Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor1Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor1Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor1Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply1Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply1Final.setFitWidth(WIDTH);
        imageViewMultiply1Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor2First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor2First.setFitWidth(WIDTH);
        imageViewMultiplyFor2First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor2Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor2Second.setFitWidth(WIDTH);
        imageViewMultiplyFor2Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor2Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor2Third.setFitWidth(WIDTH);
        imageViewMultiplyFor2Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor2Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor2Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor2Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor2Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor2Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor2Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply2Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply2Final.setFitWidth(WIDTH);
        imageViewMultiply2Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor3First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor3First.setFitWidth(WIDTH);
        imageViewMultiplyFor3First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor3Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor3Second.setFitWidth(WIDTH);
        imageViewMultiplyFor3Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor3Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor3Third.setFitWidth(WIDTH);
        imageViewMultiplyFor3Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor3Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor3Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor3Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor3Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor3Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor3Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply3Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply3Final.setFitWidth(WIDTH);
        imageViewMultiply3Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor4First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor4First.setFitWidth(WIDTH);
        imageViewMultiplyFor4First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor4Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor4Second.setFitWidth(WIDTH);
        imageViewMultiplyFor4Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor4Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor4Third.setFitWidth(WIDTH);
        imageViewMultiplyFor4Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor4Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor4Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor4Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor4Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor4Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor4Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply4Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply4Final.setFitWidth(WIDTH);
        imageViewMultiply4Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor5First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor5First.setFitWidth(WIDTH);
        imageViewMultiplyFor5First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor5Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor5Second.setFitWidth(WIDTH);
        imageViewMultiplyFor5Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor5Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor5Third.setFitWidth(WIDTH);
        imageViewMultiplyFor5Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor5Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor5Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor5Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor5Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor5Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor5Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply5Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply5Final.setFitWidth(WIDTH);
        imageViewMultiply5Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor6First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor6First.setFitWidth(WIDTH);
        imageViewMultiplyFor6First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor6Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor6Second.setFitWidth(WIDTH);
        imageViewMultiplyFor6Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor6Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor6Third.setFitWidth(WIDTH);
        imageViewMultiplyFor6Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor6Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor6Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor6Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor6Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor6Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor6Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply6Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply6Final.setFitWidth(WIDTH);
        imageViewMultiply6Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor7First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor7First.setFitWidth(WIDTH);
        imageViewMultiplyFor7First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor7Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor7Second.setFitWidth(WIDTH);
        imageViewMultiplyFor7Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor7Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor7Third.setFitWidth(WIDTH);
        imageViewMultiplyFor7Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor7Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor7Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor7Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor7Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor7Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor7Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply7Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply7Final.setFitWidth(WIDTH);
        imageViewMultiply7Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor8First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor8First.setFitWidth(WIDTH);
        imageViewMultiplyFor8First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor8Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor8Second.setFitWidth(WIDTH);
        imageViewMultiplyFor8Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor8Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor8Third.setFitWidth(WIDTH);
        imageViewMultiplyFor8Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor8Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor8Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor8Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor8Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor8Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor8Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply8Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply8Final.setFitWidth(WIDTH);
        imageViewMultiply8Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor9First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor9First.setFitWidth(WIDTH);
        imageViewMultiplyFor9First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor9Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor9Second.setFitWidth(WIDTH);
        imageViewMultiplyFor9Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor9Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor9Third.setFitWidth(WIDTH);
        imageViewMultiplyFor9Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor9Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor9Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor9Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor9Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor9Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor9Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply9Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply9Final.setFitWidth(WIDTH);
        imageViewMultiply9Final.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor10First = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor10First.setFitWidth(WIDTH);
        imageViewMultiplyFor10First.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor10Second = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor10Second.setFitWidth(WIDTH);
        imageViewMultiplyFor10Second.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor10Third = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor10Third.setFitWidth(WIDTH);
        imageViewMultiplyFor10Third.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor10Fourth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor10Fourth.setFitWidth(WIDTH);
        imageViewMultiplyFor10Fourth.setFitHeight(HEIGHT);

        ImageView imageViewMultiplyFor10Fifth = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiplyFor10Fifth.setFitWidth(WIDTH);
        imageViewMultiplyFor10Fifth.setFitHeight(HEIGHT);

        ImageView imageViewMultiply10Final = new ImageView(new Image(getClass().getResource("board.jpg").toExternalForm()));
        imageViewMultiply10Final.setFitWidth(WIDTH);
        imageViewMultiply10Final.setFitHeight(HEIGHT);
        //Titles
        Title title = new Title("Μαθηματικά");
        title.setTranslateX(WIDTH / 2 - title.getTitleWidth() / 2);
        title.setTranslateY(HEIGHT / 3);

        Title titleAdd = new Title("Κάνε την πράξη");
        titleAdd.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
        titleAdd.setTranslateY(HEIGHT / 4);

        Title titleMultiply1First = new Title("1 x 9 =");
        titleMultiply1First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply1First.setTranslateY(HEIGHT / 3);

        Title titleMultiply1Second = new Title("1 x 6 =");
        titleMultiply1Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply1Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply1Third = new Title("1 x 10 =");
        titleMultiply1Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply1Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply1Fourth = new Title("1 x 8 =");
        titleMultiply1Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply1Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply1Fifth = new Title("1 x 5 =");
        titleMultiply1Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply1Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply1Final = new Label();
        titleMultiply1Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply1Final.setTextFill(Color.WHITESMOKE);
        titleMultiply1Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply1Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply2First = new Title("2 x 6 ="); //First is Correct
        titleMultiply2First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply2First.setTranslateY(HEIGHT / 3);

        Title titleMultiply2Second = new Title("2 x 10 ="); //third is correct
        titleMultiply2Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply2Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply2Third = new Title("2 x 4 ="); //second is correct
        titleMultiply2Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply2Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply2Fourth = new Title("2 x 7 ="); //third is correct
        titleMultiply2Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply2Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply2Fifth = new Title("2 x 2 ="); //first is correct
        titleMultiply2Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply2Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply2Final = new Label();
        titleMultiply2Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply2Final.setTextFill(Color.WHITESMOKE);
        titleMultiply2Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply2Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply3First = new Title("3 x 5 ="); //3rd is Correct
        titleMultiply3First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply3First.setTranslateY(HEIGHT / 3);

        Title titleMultiply3Second = new Title("3 x 7 ="); //2rn is correct
        titleMultiply3Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply3Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply3Third = new Title("3 x 10 ="); //3rd is correct
        titleMultiply3Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply3Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply3Fourth = new Title("3 x 8 ="); //1st is correct
        titleMultiply3Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply3Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply3Fifth = new Title("3 x 6 ="); //3rd is correct
        titleMultiply3Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply3Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply3Final = new Label();
        titleMultiply3Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply3Final.setTextFill(Color.WHITESMOKE);
        titleMultiply3Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply3Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply4First = new Title("4 x 4 ="); //3rd is Correct
        titleMultiply4First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply4First.setTranslateY(HEIGHT / 3);

        Title titleMultiply4Second = new Title("4 x 10 ="); //2rn is correct
        titleMultiply4Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply4Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply4Third = new Title("4 x 8 ="); //3rd is correct
        titleMultiply4Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply4Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply4Fourth = new Title("4 x 9 ="); //1st is correct
        titleMultiply4Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply4Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply4Fifth = new Title("4 x 7 ="); //3rd is correct
        titleMultiply4Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply4Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply4Final = new Label();
        titleMultiply4Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply4Final.setTextFill(Color.WHITESMOKE);
        titleMultiply4Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply4Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply5First = new Title("5 x 5 ="); //3rd is Correct
        titleMultiply5First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply5First.setTranslateY(HEIGHT / 3);

        Title titleMultiply5Second = new Title("5 x 10 ="); //2rn is correct
        titleMultiply5Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply5Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply5Third = new Title("5 x 4 ="); //3rd is correct
        titleMultiply5Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply5Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply5Fourth = new Title("5 x 3 ="); //1st is correct
        titleMultiply5Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply5Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply5Fifth = new Title("5 x 1 ="); //3rd is correct
        titleMultiply5Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply5Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply5Final = new Label();
        titleMultiply5Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply5Final.setTextFill(Color.WHITESMOKE);
        titleMultiply5Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply5Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply6First = new Title("6 x 6 ="); //1rd is Correct
        titleMultiply6First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply6First.setTranslateY(HEIGHT / 3);

        Title titleMultiply6Second = new Title("6 x 9 ="); //2rn is correct
        titleMultiply6Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply6Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply6Third = new Title("6 x 5 ="); //3rd is correct
        titleMultiply6Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply6Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply6Fourth = new Title("6 x 4 ="); //1st is correct
        titleMultiply6Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply6Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply6Fifth = new Title("6 x 7 ="); //3rd is correct
        titleMultiply6Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply6Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply6Final = new Label();
        titleMultiply6Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply6Final.setTextFill(Color.WHITESMOKE);
        titleMultiply6Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply6Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply7First = new Title("7 x 10 ="); //1rd is Correct
        titleMultiply7First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply7First.setTranslateY(HEIGHT / 3);

        Title titleMultiply7Second = new Title("7 x 6 ="); //1rn is correct
        titleMultiply7Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply7Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply7Third = new Title("7 x 4 ="); //3rd is correct
        titleMultiply7Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply7Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply7Fourth = new Title("7 x 8 ="); //1st is correct
        titleMultiply7Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply7Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply7Fifth = new Title("7 x 5 ="); //3rd is correct
        titleMultiply7Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply7Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply7Final = new Label();
        titleMultiply7Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply7Final.setTextFill(Color.WHITESMOKE);
        titleMultiply7Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply7Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply8First = new Title("8 x 9 ="); //3rd is Correct
        titleMultiply8First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply8First.setTranslateY(HEIGHT / 3);

        Title titleMultiply8Second = new Title("8 x 8 ="); //1rn is correct
        titleMultiply8Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply8Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply8Third = new Title("8 x 6 ="); //2rd is correct
        titleMultiply8Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply8Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply8Fourth = new Title("8 x 10 ="); //1st is correct
        titleMultiply8Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply8Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply8Fifth = new Title("8 x 2 ="); //3rd is correct
        titleMultiply8Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply8Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply8Final = new Label();
        titleMultiply8Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply8Final.setTextFill(Color.WHITESMOKE);
        titleMultiply8Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply8Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply9First = new Title("9 x 9 ="); //3rd is Correct
        titleMultiply9First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply9First.setTranslateY(HEIGHT / 3);

        Title titleMultiply9Second = new Title("9 x 5 ="); //1rn is correct
        titleMultiply9Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply9Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply9Third = new Title("9 x 4 ="); //2rd is correct
        titleMultiply9Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply9Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply9Fourth = new Title("9 x 6 ="); //1st is correct
        titleMultiply9Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply9Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply9Fifth = new Title("9 x 3 ="); //3rd is correct
        titleMultiply9Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply9Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply9Final = new Label();
        titleMultiply9Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply9Final.setTextFill(Color.WHITESMOKE);
        titleMultiply9Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply9Final.setTranslateY(HEIGHT / 3);

        Title titleMultiply10First = new Title("10 x 5 ="); //3rd is Correct
        titleMultiply10First.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply10First.setTranslateY(HEIGHT / 3);

        Title titleMultiply10Second = new Title("10 x 10 ="); //1rn is correct
        titleMultiply10Second.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply10Second.setTranslateY(HEIGHT / 3);

        Title titleMultiply10Third = new Title("10 x 2 ="); //2rd is correct
        titleMultiply10Third.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply10Third.setTranslateY(HEIGHT / 3);

        Title titleMultiply10Fourth = new Title("10 x 8 ="); //1st is correct
        titleMultiply10Fourth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply10Fourth.setTranslateY(HEIGHT / 3);

        Title titleMultiply10Fifth = new Title("10 x 2 ="); //3rd is correct
        titleMultiply10Fifth.setTranslateX(WIDTH / 1.65 - title.getTitleWidth() / 2);
        titleMultiply10Fifth.setTranslateY(HEIGHT / 3);

        Label titleMultiply10Final = new Label();
        titleMultiply10Final.setFont(Font.loadFont(MathsFX.class.getResource("CaslonItalic.ttf").toExternalForm(), 68));
        titleMultiply10Final.setTextFill(Color.WHITESMOKE);
        titleMultiply10Final.setTranslateX(WIDTH / 1.9 - title.getTitleWidth() / 2);
        titleMultiply10Final.setTranslateY(HEIGHT / 3);

        Title titleLearn = new Title("Δίαλεξε την κατηγορία \n"
                + "που επιθυμείς να μάθεις");
        titleLearn.setTranslateX(WIDTH / 4 - title.getTitleWidth() / 2.5);
        titleLearn.setTranslateY(HEIGHT / 3);

        Title titleMultiply = new Title("    Δίαλεξε την προπαίδεια \n"
                + "που επιθυμείς να εξασκηθείς");
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

        //Αλεξ & Γιώργος
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

        //Askisi1 div help
        Image Askisi1_diairesi_help_image = new Image("/Askisi1_diairesi_help.png");
        ImageView Askisi1_diairesi_help = new ImageView(Askisi1_diairesi_help_image);
        
        //Askisi2 div help
        Image Askisi2_diairesi_help_image = new Image("/Askisi2_diairesi_help.png");
        ImageView Askisi2_diairesi_help = new ImageView(Askisi2_diairesi_help_image);
        
        //Askisi3 div help
        Image Askisi3_diairesi_help_image = new Image("/Askisi3_diairesi_help.png");
        ImageView Askisi3_diairesi_help = new ImageView(Askisi3_diairesi_help_image);
        
        //Askisi4 div help
        Image Askisi4_diairesi_help_image = new Image("/Askisi4_diairesi_help.png");
        ImageView Askisi4_diairesi_help = new ImageView(Askisi4_diairesi_help_image);
                
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

        //Layouts gia Diairesi
        StackPane Layout_Askisi1_diairesi = new StackPane();
        StackPane Layout_Askisi1_diairesi_Solution = new StackPane();
        StackPane Layout_Askisi2_diairesi = new StackPane();
        StackPane Layout_Askisi2_diairesi_Solution = new StackPane();
        StackPane Layout_Askisi3_diairesi = new StackPane();
        StackPane Layout_Askisi3_diairesi_Solution = new StackPane();
        StackPane Layout_Askisi4_diairesi = new StackPane();
        StackPane Layout_Askisi4_diairesi_Solution = new StackPane();
        
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

        //Adding Elements in Layouts gia diairesi
        Layout_Askisi1_diairesi.getChildren().addAll(Askisi1_diairesi, Askisi1_diairesi_choice1, Askisi1_diairesi_choice2_Correct, Askisi1_diairesi_choice3, btnReturn_Askisi1_diairesi, help_Askisi1_diairesi);
        Layout_Askisi1_diairesi_Solution.getChildren().addAll(Askisi1_diairesi_Solution, btnReturn_Askisi1_diairesi_Solution, Continue_Askisi1_diairesi);
        Layout_Askisi2_diairesi.getChildren().addAll(Askisi2_diairesi, Askisi2_diairesi_choice1_Correct, Askisi2_diairesi_choice2, Askisi2_diairesi_choice3, btnReturn_Askisi2_diairesi, help_Askisi2_diairesi);
        Layout_Askisi2_diairesi_Solution.getChildren().addAll(Askisi2_diairesi_Solution, btnReturn_Askisi2_diairesi_Solution, Continue_Askisi2_diairesi);
        Layout_Askisi3_diairesi.getChildren().addAll(Askisi3_diairesi, Askisi3_diairesi_choice1, Askisi3_diairesi_choice2, Askisi3_diairesi_choice3_Correct, btnReturn_Askisi3_diairesi, help_Askisi3_diairesi);
        Layout_Askisi3_diairesi_Solution.getChildren().addAll(Askisi3_diairesi_Solution, btnReturn_Askisi3_diairesi_Solution, Continue_Askisi3_diairesi);
        Layout_Askisi4_diairesi.getChildren().addAll(Askisi4_diairesi, Askisi4_diairesi_choice1_Correct, Askisi4_diairesi_choice2, Askisi4_diairesi_choice3, btnReturn_Askisi4_diairesi, help_Askisi4_diairesi);
        Layout_Askisi4_diairesi_Solution.getChildren().addAll(Askisi4_diairesi_Solution, btnReturn_Askisi4_diairesi_Solution);
                
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
        Scene sceneComFirst = new Scene(Layout_Askisi1_sugkritis, 1164, 500);
        Scene sceneComFirstCorrect = new Scene(Layout_Askisi1_sugkritis_Solution, 1164, 500);
        Scene sceneComSecond = new Scene(Layout_Askisi2_sugkritis, 1164, 500);
        Scene sceneComSecondCorrect = new Scene(Layout_Askisi2_sugkritis_Solution, 1164, 500);
        Scene sceneComThird = new Scene(Layout_Askisi3_sugkritis, 1164, 500);
        Scene sceneComThirdCorrect = new Scene(Layout_Askisi3_sugkritis_Solution, 1164, 500);
        Scene sceneComFourth = new Scene(Layout_Askisi4_sugkritis, 1164, 500);
        Scene sceneComFourthCorrect = new Scene(Layout_Askisi4_sugkritis_Solution, 1164, 500);

        //Scenes gia diairesi
        Scene sceneDivFirst = new Scene(Layout_Askisi1_diairesi, 1164, 500);
        Scene sceneDivFirstCorrect = new Scene(Layout_Askisi1_diairesi_Solution, 1164, 500);
        Scene sceneDivSecond = new Scene(Layout_Askisi2_diairesi, 1164, 500);
        Scene sceneDivSecondCorrect = new Scene(Layout_Askisi2_diairesi_Solution, 1164, 500);
        Scene sceneDivThird = new Scene(Layout_Askisi3_diairesi, 1164, 500);
        Scene sceneDivThirdCorrect = new Scene(Layout_Askisi3_diairesi_Solution, 1164, 500);
        Scene sceneDivFourth = new Scene(Layout_Askisi4_diairesi, 1164, 500);
        Scene sceneDivFourthCorrect = new Scene(Layout_Askisi4_diairesi_Solution, 1164, 500);
        
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
        
        //Koumpi Diairesi Action
        btnDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_diairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivFirst);
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

        //Diairesi Button Actions
        Askisi1_diairesi_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi1_diairesi_choice2_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi1_diairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivFirstCorrect);
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
        Askisi1_diairesi_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi1_diairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi1_diairesi_help));
        btnReturn_Askisi1_diairesi.setOnAction(new EventHandler<ActionEvent>() {
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
        btnReturn_Askisi1_diairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
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
        Continue_Askisi1_diairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_diairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivSecond);
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
        Askisi2_diairesi_choice1_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi2_diairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivSecondCorrect);
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
        Askisi2_diairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi2_diairesi_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi2_diairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi2_diairesi_help));
        btnReturn_Askisi2_diairesi.setOnAction(new EventHandler<ActionEvent>() {
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
        btnReturn_Askisi2_diairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
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
        Continue_Askisi2_diairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi3_diairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivThird);
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
        Askisi3_diairesi_choice1.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi3_diairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi3_diairesi_choice3_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi3_diairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivThirdCorrect);
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
        help_Askisi3_diairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi3_diairesi_help));
        btnReturn_Askisi3_diairesi.setOnAction(new EventHandler<ActionEvent>() {
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
        btnReturn_Askisi3_diairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
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
        Continue_Askisi3_diairesi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_diairesi);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivFourth);
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
        Askisi4_diairesi_choice1_Correct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(Layout_Askisi4_diairesi_Solution);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneDivFourthCorrect);
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
        Askisi4_diairesi_choice2.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        Askisi4_diairesi_choice3.setOnAction(e -> WrongAnswerBox.display("Λάθος Άπάντηση", "Ξαναπροσπάθησε!"));
        help_Askisi4_diairesi.setOnAction(e -> Help_afairesi.display("Βοήθεια", Askisi2_diairesi_help));
        btnReturn_Askisi4_diairesi.setOnAction(new EventHandler<ActionEvent>() {
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
        btnReturn_Askisi4_diairesi_Solution.setOnAction(new EventHandler<ActionEvent>() {
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

        //Alignments Diairesi
        Layout_Askisi1_diairesi.setAlignment(Askisi1_diairesi_choice1, Pos.TOP_LEFT);
        Layout_Askisi1_diairesi.setAlignment(Askisi1_diairesi_choice2_Correct, Pos.TOP_CENTER);
        Layout_Askisi1_diairesi.setAlignment(Askisi1_diairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi1_diairesi.setAlignment(btnReturn_Askisi1_diairesi, Pos.TOP_LEFT);
        Layout_Askisi1_diairesi.setAlignment(help_Askisi1_diairesi, Pos.TOP_LEFT);
        Layout_Askisi1_diairesi_Solution.setAlignment(btnReturn_Askisi1_diairesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi1_diairesi_Solution.setAlignment(Continue_Askisi1_diairesi, Pos.TOP_RIGHT);
        Layout_Askisi2_diairesi.setAlignment(Askisi2_diairesi_choice1_Correct, Pos.TOP_LEFT);
        Layout_Askisi2_diairesi.setAlignment(Askisi2_diairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi2_diairesi.setAlignment(Askisi2_diairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi2_diairesi.setAlignment(btnReturn_Askisi2_diairesi, Pos.TOP_LEFT);
        Layout_Askisi2_diairesi.setAlignment(help_Askisi2_diairesi, Pos.TOP_LEFT);
        Layout_Askisi2_diairesi_Solution.setAlignment(btnReturn_Askisi2_diairesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi2_diairesi_Solution.setAlignment(Continue_Askisi2_diairesi, Pos.TOP_RIGHT);
        Layout_Askisi3_diairesi.setAlignment(Askisi3_diairesi_choice1, Pos.TOP_LEFT);
        Layout_Askisi3_diairesi.setAlignment(Askisi3_diairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi3_diairesi.setAlignment(Askisi3_diairesi_choice3_Correct, Pos.TOP_RIGHT);
        Layout_Askisi3_diairesi.setAlignment(btnReturn_Askisi3_diairesi, Pos.TOP_LEFT);
        Layout_Askisi3_diairesi.setAlignment(help_Askisi3_diairesi, Pos.TOP_LEFT);
        Layout_Askisi3_diairesi_Solution.setAlignment(btnReturn_Askisi3_diairesi_Solution, Pos.TOP_LEFT);
        Layout_Askisi3_diairesi_Solution.setAlignment(Continue_Askisi3_diairesi, Pos.TOP_RIGHT);
        Layout_Askisi4_diairesi.setAlignment(Askisi4_diairesi_choice1_Correct, Pos.TOP_LEFT);
        Layout_Askisi4_diairesi.setAlignment(Askisi4_diairesi_choice2, Pos.TOP_CENTER);
        Layout_Askisi4_diairesi.setAlignment(Askisi4_diairesi_choice3, Pos.TOP_RIGHT);
        Layout_Askisi4_diairesi.setAlignment(btnReturn_Askisi4_diairesi, Pos.TOP_LEFT);
        Layout_Askisi4_diairesi.setAlignment(help_Askisi4_diairesi, Pos.TOP_LEFT);
        Layout_Askisi4_diairesi_Solution.setAlignment(btnReturn_Askisi4_diairesi_Solution, Pos.TOP_CENTER);
        
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        //-------------------------------------------------------------
        
        
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
                rootLearn.setCache(true);
                rootLearn.setCacheHint(CacheHint.SPEED);
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
                rootMultiply.setCache(true);
                rootMultiply.setCacheHint(CacheHint.SPEED);
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
        // Scenes for Multiply 1-10 and Handlers ------------------------------------------------------------------------------------------
        btnMultiplySelect1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1);
            }
        });
        Return_Askisi1_multiply1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply1Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnMultiplyFirstEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Second);
                titleMultiply1Final.setText("Βρήκες : " + Integer.toString(counter) + " στα 5");
            }
        });
        btnMultiplyFirstEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Second);
                titleMultiply1Final.setText("Βρήκες : " + Integer.toString(counter) + " στα 5");
            }
        });
        btnMultiplyFirstEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Second);
                counter();
                titleMultiply1Final.setText("Βρήκες : " + Integer.toString(counter) + " στα 5");
            }
        });
        btnMultiplyFirstEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Third);
                counter();
                titleMultiply1Final.setText("Βρήκες : " + Integer.toString(counter) + " στα 5");
            }
        });
        btnMultiplyFirstEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Third);
            }
        });
        btnMultiplyFirstEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Third);
            }
        });
        btnMultiplyFirstEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Fourth);
            }
        });
        btnMultiplyFirstEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Fourth);
                counter();
            }
        });
        btnMultiplyFirstEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Fourth);

            }
        });
        btnMultiplyFirstEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply1Fifth);
            }
        });
        btnMultiplyFirstEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Fifth);
            }
        });
        btnMultiplyFirstEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Fifth);

            }
        });
        btnMultiplyFirstEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1FinalPane);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Final);
                switch (counter) {
                    case 0:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply1Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
            }
        });
        btnMultiplyFirstEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1FinalPane);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply1Final);
                switch (counter) {
                    case 0:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply1Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
            }
        });
        btnMultiplyFirstEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply1FinalPane);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();

                switch (counter) {
                    case 0:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply1Final.setTranslateX(WIDTH / 2.9 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Τα πήγες αρκετά καλά : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply1Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply1Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }

                primaryStage.setScene(sceneMultiply1Final);

            }
        });
        btnMultiplySelect2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply2.setCache(true);
                rootMultiply2.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply2);
            }
        });
        Return_Askisi1_multiply2.setOnAction(new EventHandler<ActionEvent>() {
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
        btnMultiplySecondEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply2Second);
            }
        });
        btnMultiplySecondEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Second);
            }
        });
        btnMultiplySecondEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Second);
            }
        });
        btnMultiplySecondEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Third);
            }
        });
        btnMultiplySecondEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Third);
            }
        });
        btnMultiplySecondEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply2Third);
            }
        });
        btnMultiplySecondEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Fourth);
            }
        });
        btnMultiplySecondEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply2Fourth);
            }
        });
        btnMultiplySecondEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Fourth);
            }
        });
        btnMultiplySecondEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Fifth);
            }
        });
        btnMultiplySecondEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply2Fifth);
            }
        });
        btnMultiplySecondEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply2Fifth);
            }
        });
        btnMultiplySecondEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply2Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply2Final);

            }
        });
        btnMultiplySecondEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply2Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply2Final);
            }
        });
        btnMultiplySecondEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply2Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply2Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply2Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply2Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply2Final);
            }
        });
        //Returns for 2
        Return_Askisi1_multiply2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply2Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        btnMultiplySelect3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply2.setCache(true);
                rootMultiply2.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply3);
            }
        });
        Return_Askisi1_multiply3.setOnAction(new EventHandler<ActionEvent>() {
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
        btnMultiplyThirdEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Second);
            }
        });
        btnMultiplyThirdEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Second);
            }
        });
        btnMultiplyThirdEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply3Second);
            }
        });
        btnMultiplyThirdEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Third);
            }
        });
        btnMultiplyThirdEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply3Third);
            }
        });
        btnMultiplyThirdEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Third);
            }
        });
        btnMultiplyThirdEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Fourth);
            }
        });
        btnMultiplyThirdEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Fourth);
            }
        });
        btnMultiplyThirdEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply3Fourth);
            }
        });
        btnMultiplyThirdEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply3Fifth);
            }
        });
        btnMultiplyThirdEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Fifth);
            }
        });
        btnMultiplyThirdEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply3Fifth);
            }
        });
        btnMultiplyThirdEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply3Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply3Final);

            }
        });
        btnMultiplyThirdEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply3Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply3Final);
            }
        });
        btnMultiplyThirdEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply3Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply3Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply3Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply3Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply3Final);
            }
        });
        //Returns for 3
        Return_Askisi1_multiply3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply3Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        //Buttons for 4
        btnMultiplySelect4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply4.setCache(true);
                rootMultiply4.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply4);
            }
        });
        Return_Askisi1_multiply4.setOnAction(new EventHandler<ActionEvent>() {
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
        btnMultiplyFourthEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Second);
            }
        });
        btnMultiplyFourthEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Second);
            }
        });
        btnMultiplyFourthEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply4Second);
            }
        });
        btnMultiplyFourthEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Third);
            }
        });
        btnMultiplyFourthEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply4Third);
            }
        });
        btnMultiplyFourthEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Third);
            }
        });
        btnMultiplyFourthEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Fourth);
            }
        });
        btnMultiplyFourthEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Fourth);
            }
        });
        btnMultiplyFourthEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply4Fourth);
            }
        });
        btnMultiplyFourthEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply4Fifth);
            }
        });
        btnMultiplyFourthEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Fifth);
            }
        });
        btnMultiplyFourthEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply4Fifth);
            }
        });
        btnMultiplyFourthEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply4Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply4Final);

            }
        });
        btnMultiplyFourthEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply4Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply4Final);
            }
        });
        btnMultiplyFourthEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply4Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply4Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply4Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply4Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply4Final);
            }
        });
        //Returns for 4
        Return_Askisi1_multiply4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply4Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply4Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply4Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply4Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply4Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        //Buttons for 5
        btnMultiplySelect5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply4.setCache(true);
                rootMultiply4.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply5);
            }
        });
        btnMultiplyFifthEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Second);
            }
        });
        btnMultiplyFifthEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Second);
            }
        });
        btnMultiplyFifthEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply5Second);
            }
        });
        btnMultiplyFifthEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Third);
            }
        });
        btnMultiplyFifthEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply5Third);
            }
        });
        btnMultiplyFifthEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Third);
            }
        });
        btnMultiplyFifthEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Fourth);
            }
        });
        btnMultiplyFifthEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Fourth);
            }
        });
        btnMultiplyFifthEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply5Fourth);
            }
        });
        btnMultiplyFifthEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply5Fifth);
            }
        });
        btnMultiplyFifthEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Fifth);
            }
        });
        btnMultiplyFifthEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply5Fifth);
            }
        });
        btnMultiplyFifthEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply5Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply5Final);

            }
        });
        btnMultiplyFifthEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply5Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply5Final);
            }
        });
        btnMultiplyFifthEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply5Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply5Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply5Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply5Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply5Final);
            }
        });
        //Returns for 5
        Return_Askisi1_multiply5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply5Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply5Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply5Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply5Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply5Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        //Buttons for 6
        btnMultiplySelect6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply6.setCache(true);
                rootMultiply6.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply6);
            }
        });
        btnMultiplySixthEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply6Second);
            }
        });
        btnMultiplySixthEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Second);
            }
        });
        btnMultiplySixthEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Second);
            }
        });
        btnMultiplySixthEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Third);
            }
        });
        btnMultiplySixthEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply6Third);
            }
        });
        btnMultiplySixthEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Third);
            }
        });
        btnMultiplySixthEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Fourth);
            }
        });
        btnMultiplySixthEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Fourth);
            }
        });
        btnMultiplySixthEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply6Fourth);
            }
        });
        btnMultiplySixthEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply6Fifth);
            }
        });
        btnMultiplySixthEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Fifth);
            }
        });
        btnMultiplySixthEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply6Fifth);
            }
        });
        btnMultiplySixthEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply6Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply6Final);

            }
        });
        btnMultiplySixthEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply6Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply6Final);
            }
        });
        btnMultiplySixthEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply6Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply6Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply6Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply6Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply6Final);
            }
        });
        //Returns for 6
        Return_Askisi1_multiply6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply6Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply6Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply6Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply6Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply6Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        //Buttons for 7
        btnMultiplySelect7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply7.setCache(true);
                rootMultiply7.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply7);
            }
        });
        btnMultiplySeventhEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply7Second);
            }
        });
        btnMultiplySeventhEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Second);
            }
        });
        btnMultiplySeventhEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Second);
            }
        });
        btnMultiplySeventhEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply7Third);
            }
        });
        btnMultiplySeventhEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Third);
            }
        });
        btnMultiplySeventhEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Third);
            }
        });
        btnMultiplySeventhEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Fourth);
            }
        });
        btnMultiplySeventhEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Fourth);
            }
        });
        btnMultiplySeventhEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply7Fourth);
            }
        });
        btnMultiplySeventhEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply7Fifth);
            }
        });
        btnMultiplySeventhEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Fifth);
            }
        });
        btnMultiplySeventhEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply7Fifth);
            }
        });
        btnMultiplySeventhEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply7Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply7Final);

            }
        });
        btnMultiplySeventhEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply7Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply7Final);
            }
        });
        btnMultiplySeventhEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply7Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply7Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply7Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply7Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply7Final);
            }
        });
//        Returns for 7
        Return_Askisi1_multiply7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply7Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply7Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply7Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply7Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply7Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });

        //Buttons for 8
        btnMultiplySelect8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply7.setCache(true);
                rootMultiply7.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply8);
            }
        });
        btnMultiplyEightEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Second);
            }
        });
        btnMultiplyEightEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Second);
            }
        });
        btnMultiplyEightEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply8Second);
            }
        });
        btnMultiplyEightEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply8Third);
            }
        });
        btnMultiplyEightEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Third);
            }
        });
        btnMultiplyEightEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Third);
            }
        });
        btnMultiplyEightEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Fourth);
            }
        });
        btnMultiplyEightEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply8Fourth);
            }
        });
        btnMultiplyEightEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Fourth);
            }
        });
        btnMultiplyEightEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply8Fifth);
            }
        });
        btnMultiplyEightEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Fifth);
            }
        });
        btnMultiplyEightEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply8Fifth);
            }
        });
        btnMultiplyEightEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply8Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply8Final);

            }
        });
        btnMultiplyEightEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply8Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply8Final);
            }
        });
        btnMultiplyEightEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply8Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply8Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply8Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply8Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply8Final);
            }
        });
//        Returns for 8
        Return_Askisi1_multiply8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply8Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply8Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply8Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply8Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply8Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });

        //Buttons for 9
        btnMultiplySelect9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply9.setCache(true);
                rootMultiply9.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply9);
            }
        });
        btnMultiplyNineEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Second);
            }
        });
        btnMultiplyNineEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Second);
            }
        });
        btnMultiplyNineEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply9Second);
            }
        });
        btnMultiplyNineEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply9Third);
            }
        });
        btnMultiplyNineEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Third);
            }
        });
        btnMultiplyNineEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Third);
            }
        });
        btnMultiplyNineEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Fourth);
            }
        });
        btnMultiplyNineEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply9Fourth);
            }
        });
        btnMultiplyNineEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Fourth);
            }
        });
        btnMultiplyNineEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply9Fifth);
            }
        });
        btnMultiplyNineEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Fifth);
            }
        });
        btnMultiplyNineEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply9Fifth);
            }
        });
        btnMultiplyNineEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply9Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply9Final);

            }
        });
        btnMultiplyNineEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply9Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply9Final);
            }
        });
        btnMultiplyNineEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply9Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply9Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply9Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply9Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply9Final);
            }
        });
//        Returns for 9
        Return_Askisi1_multiply9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply9Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply9Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply9Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply9Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply9Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });

        //Buttons for 9
        btnMultiplySelect10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                rootMultiply9.setCache(true);
                rootMultiply9.setCacheHint(CacheHint.SPEED);
                primaryStage.setScene(sceneMultiply10);
            }
        });
        btnMultiplyTenEx1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Second);
            }
        });
        btnMultiplyTenEx2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Second);
            }
        });
        btnMultiplyTenEx3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Second);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply10Second);
            }
        });
        btnMultiplyTenEx1Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply10Third);
            }
        });
        btnMultiplyTenEx2Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Third);
            }
        });
        btnMultiplyTenEx3Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Third);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Third);
            }
        });
        btnMultiplyTenEx1Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Fourth);
            }
        });
        btnMultiplyTenEx2Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Fourth);
            }
        });
        btnMultiplyTenEx3Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Fourth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply10Fourth);
            }
        });
        btnMultiplyTenEx1Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                primaryStage.setScene(sceneMultiply10Fifth);
            }
        });
        btnMultiplyTenEx2Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Fifth);
            }
        });
        btnMultiplyTenEx3Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Fifth);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply10Fifth);
            }
        });
        btnMultiplyTenEx1Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply10Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply10Final);

            }
        });
        btnMultiplyTenEx2Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                switch (counter) {
                    case 0:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply10Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply10Final);
            }
        });
        btnMultiplyTenEx3Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply10Final);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                counter();
                switch (counter) {
                    case 0:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.6 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Δυστυχώς δεν βρήκες ούτε ένα");
                        break;
                    case 1:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 2:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.2 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Βρήκες μόνο : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 3:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        break;
                    case 4:
                        titleMultiply10Final.setTranslateX(WIDTH / 2.5 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Τα πήγες μέτρια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                    case 5:
                        titleMultiply10Final.setTranslateX(WIDTH / 3 - title.getTitleWidth() / 2);
                        titleMultiply10Final.setText("Μπράβο τα πήγες τέλεια : " + Integer.toString(counter) + " στα 5");
                        PlaySound();
                        break;
                }
                primaryStage.setScene(sceneMultiply10Final);
            }
        });
//        Returns for 8
        Return_Askisi1_multiply10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
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
        Return_Askisi1_multiply10Second.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply10Fifth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply10Third.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply10Fourth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        Return_Askisi1_multiply10Final.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.millis(1000));
                ft.setNode(rootMultiply);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
                primaryStage.setScene(sceneMultiply);
                rootAdd.getChildren().removeAll(t, btnNext);
                counter = 0;
                ft.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        btnAddCorrentAnswerOnFirst.setTranslateX(535);
                        btnAddCorrentAnswerOnFirst.setTranslateY(450);
                    }
                });
            }
        });
        //Scene, Stages
        rootMultiply1FinalPane.getChildren().addAll(imageViewMultiply1Final, titleMultiply1Final, Return_Askisi1_multiply1Final);
        rootMultiply1.getChildren().addAll(imageViewMultiplyFor1First, titleMultiply1First, Return_Askisi1_multiply1, btnMultiplyFirstEx1, btnMultiplyFirstEx2, btnMultiplyFirstEx3);
        rootMultiply1Second.getChildren().addAll(imageViewMultiplyFor1Second, titleMultiply1Second, Return_Askisi1_multiply1Second, btnMultiplyFirstEx1Second, btnMultiplyFirstEx2Second, btnMultiplyFirstEx3Second);
        rootMultiply1Third.getChildren().addAll(imageViewMultiplyFor1Third, titleMultiply1Third, Return_Askisi1_multiply1Third, btnMultiplyFirstEx1Third, btnMultiplyFirstEx2Third, btnMultiplyFirstEx3Third);
        rootMultiply1Fourth.getChildren().addAll(imageViewMultiplyFor1Fourth, titleMultiply1Fourth, Return_Askisi1_multiply1Fourth, btnMultiplyFirstEx1Fourth, btnMultiplyFirstEx2Fourth, btnMultiplyFirstEx3Fourth);
        rootMultiply1Fifth.getChildren().addAll(imageViewMultiplyFor1Fifth, titleMultiply1Fifth, Return_Askisi1_multiply1Fifth, btnMultiplyFirstEx1Fifth, btnMultiplyFirstEx2Fifth, btnMultiplyFirstEx3Fifth);
        //Multiply for 2 scenes
        rootMultiply2.getChildren().addAll(imageViewMultiplyFor2First, titleMultiply2First, Return_Askisi1_multiply2, btnMultiplySecondEx1, btnMultiplySecondEx2, btnMultiplySecondEx3);
        rootMultiply2Second.getChildren().addAll(imageViewMultiplyFor2Second, titleMultiply2Second, Return_Askisi1_multiply2Second, btnMultiplySecondEx1Second, btnMultiplySecondEx2Second, btnMultiplySecondEx3Second);
        rootMultiply2Third.getChildren().addAll(imageViewMultiplyFor2Third, titleMultiply2Third, Return_Askisi1_multiply2Third, btnMultiplySecondEx1Third, btnMultiplySecondEx2Third, btnMultiplySecondEx3Third);
        rootMultiply2Fourth.getChildren().addAll(imageViewMultiplyFor2Fourth, titleMultiply2Fourth, Return_Askisi1_multiply2Fourth, btnMultiplySecondEx1Fourth, btnMultiplySecondEx2Fourth, btnMultiplySecondEx3Fourth);
        rootMultiply2Fifth.getChildren().addAll(imageViewMultiplyFor2Fifth, titleMultiply2Fifth, Return_Askisi1_multiply2Fifth, btnMultiplySecondEx1Fifth, btnMultiplySecondEx2Fifth, btnMultiplySecondEx3Fifth);
        rootMultiply2Final.getChildren().addAll(imageViewMultiply2Final, titleMultiply2Final, Return_Askisi1_multiply2Final);
        //Multiply for 3 scenes
        rootMultiply3.getChildren().addAll(imageViewMultiplyFor3First, titleMultiply3First, Return_Askisi1_multiply3, btnMultiplyThirdEx1, btnMultiplyThirdEx2, btnMultiplyThirdEx3);
        rootMultiply3Second.getChildren().addAll(imageViewMultiplyFor3Second, titleMultiply3Second, Return_Askisi1_multiply3Second, btnMultiplyThirdEx1Second, btnMultiplyThirdEx2Second, btnMultiplyThirdEx3Second);
        rootMultiply3Third.getChildren().addAll(imageViewMultiplyFor3Third, titleMultiply3Third, Return_Askisi1_multiply3Third, btnMultiplyThirdEx1Third, btnMultiplyThirdEx2Third, btnMultiplyThirdEx3Third);
        rootMultiply3Fourth.getChildren().addAll(imageViewMultiplyFor3Fourth, titleMultiply3Fourth, Return_Askisi1_multiply3Fourth, btnMultiplyThirdEx1Fourth, btnMultiplyThirdEx2Fourth, btnMultiplyThirdEx3Fourth);
        rootMultiply3Fifth.getChildren().addAll(imageViewMultiplyFor3Fifth, titleMultiply3Fifth, Return_Askisi1_multiply3Fifth, btnMultiplyThirdEx1Fifth, btnMultiplyThirdEx2Fifth, btnMultiplyThirdEx3Fifth);
        rootMultiply3Final.getChildren().addAll(imageViewMultiply3Final, titleMultiply3Final, Return_Askisi1_multiply3Final);
        //Multiply for 4 scenes
        rootMultiply4.getChildren().addAll(imageViewMultiplyFor4First, titleMultiply4First, Return_Askisi1_multiply4, btnMultiplyFourthEx1, btnMultiplyFourthEx2, btnMultiplyFourthEx3);
        rootMultiply4Second.getChildren().addAll(imageViewMultiplyFor4Second, titleMultiply4Second, Return_Askisi1_multiply4Second, btnMultiplyFourthEx1Second, btnMultiplyFourthEx2Second, btnMultiplyFourthEx3Second);
        rootMultiply4Third.getChildren().addAll(imageViewMultiplyFor4Third, titleMultiply4Third, Return_Askisi1_multiply4Third, btnMultiplyFourthEx1Third, btnMultiplyFourthEx2Third, btnMultiplyFourthEx3Third);
        rootMultiply4Fourth.getChildren().addAll(imageViewMultiplyFor4Fourth, titleMultiply4Fourth, Return_Askisi1_multiply4Fourth, btnMultiplyFourthEx1Fourth, btnMultiplyFourthEx2Fourth, btnMultiplyFourthEx3Fourth);
        rootMultiply4Fifth.getChildren().addAll(imageViewMultiplyFor4Fifth, titleMultiply4Fifth, Return_Askisi1_multiply4Fifth, btnMultiplyFourthEx1Fifth, btnMultiplyFourthEx2Fifth, btnMultiplyFourthEx3Fifth);
        rootMultiply4Final.getChildren().addAll(imageViewMultiply4Final, titleMultiply4Final, Return_Askisi1_multiply4Final);
        //Multiply for 5 scenes
        rootMultiply5.getChildren().addAll(imageViewMultiplyFor5First, titleMultiply5First, Return_Askisi1_multiply5, btnMultiplyFifthEx1, btnMultiplyFifthEx2, btnMultiplyFifthEx3);
        rootMultiply5Second.getChildren().addAll(imageViewMultiplyFor5Second, titleMultiply5Second, Return_Askisi1_multiply5Second, btnMultiplyFifthEx1Second, btnMultiplyFifthEx2Second, btnMultiplyFifthEx3Second);
        rootMultiply5Third.getChildren().addAll(imageViewMultiplyFor5Third, titleMultiply5Third, Return_Askisi1_multiply5Third, btnMultiplyFifthEx1Third, btnMultiplyFifthEx2Third, btnMultiplyFifthEx3Third);
        rootMultiply5Fourth.getChildren().addAll(imageViewMultiplyFor5Fourth, titleMultiply5Fourth, Return_Askisi1_multiply5Fourth, btnMultiplyFifthEx1Fourth, btnMultiplyFifthEx2Fourth, btnMultiplyFifthEx3Fourth);
        rootMultiply5Fifth.getChildren().addAll(imageViewMultiplyFor5Fifth, titleMultiply5Fifth, Return_Askisi1_multiply5Fifth, btnMultiplyFifthEx1Fifth, btnMultiplyFifthEx2Fifth, btnMultiplyFifthEx3Fifth);
        rootMultiply5Final.getChildren().addAll(imageViewMultiply5Final, titleMultiply5Final, Return_Askisi1_multiply5Final);
        //Multiply for 6 scenes
        rootMultiply6.getChildren().addAll(imageViewMultiplyFor6First, titleMultiply6First, Return_Askisi1_multiply6, btnMultiplySixthEx1, btnMultiplySixthEx2, btnMultiplySixthEx3);
        rootMultiply6Second.getChildren().addAll(imageViewMultiplyFor6Second, titleMultiply6Second, Return_Askisi1_multiply6Second, btnMultiplySixthEx1Second, btnMultiplySixthEx2Second, btnMultiplySixthEx3Second);
        rootMultiply6Third.getChildren().addAll(imageViewMultiplyFor6Third, titleMultiply6Third, Return_Askisi1_multiply6Third, btnMultiplySixthEx1Third, btnMultiplySixthEx2Third, btnMultiplySixthEx3Third);
        rootMultiply6Fourth.getChildren().addAll(imageViewMultiplyFor6Fourth, titleMultiply6Fourth, Return_Askisi1_multiply6Fourth, btnMultiplySixthEx1Fourth, btnMultiplySixthEx2Fourth, btnMultiplySixthEx3Fourth);
        rootMultiply6Fifth.getChildren().addAll(imageViewMultiplyFor6Fifth, titleMultiply6Fifth, Return_Askisi1_multiply6Fifth, btnMultiplySixthEx1Fifth, btnMultiplySixthEx2Fifth, btnMultiplySixthEx3Fifth);
        rootMultiply6Final.getChildren().addAll(imageViewMultiply6Final, titleMultiply6Final, Return_Askisi1_multiply6Final);
        //Multiply for 7 scenes
        rootMultiply7.getChildren().addAll(imageViewMultiplyFor7First, titleMultiply7First, Return_Askisi1_multiply7, btnMultiplySeventhEx1, btnMultiplySeventhEx2, btnMultiplySeventhEx3);
        rootMultiply7Second.getChildren().addAll(imageViewMultiplyFor7Second, titleMultiply7Second, Return_Askisi1_multiply7Second, btnMultiplySeventhEx1Second, btnMultiplySeventhEx2Second, btnMultiplySeventhEx3Second);
        rootMultiply7Third.getChildren().addAll(imageViewMultiplyFor7Third, titleMultiply7Third, Return_Askisi1_multiply7Third, btnMultiplySeventhEx1Third, btnMultiplySeventhEx2Third, btnMultiplySeventhEx3Third);
        rootMultiply7Fourth.getChildren().addAll(imageViewMultiplyFor7Fourth, titleMultiply7Fourth, Return_Askisi1_multiply7Fourth, btnMultiplySeventhEx1Fourth, btnMultiplySeventhEx2Fourth, btnMultiplySeventhEx3Fourth);
        rootMultiply7Fifth.getChildren().addAll(imageViewMultiplyFor7Fifth, titleMultiply7Fifth, Return_Askisi1_multiply7Fifth, btnMultiplySeventhEx1Fifth, btnMultiplySeventhEx2Fifth, btnMultiplySeventhEx3Fifth);
        rootMultiply7Final.getChildren().addAll(imageViewMultiply7Final, titleMultiply7Final, Return_Askisi1_multiply7Final);
        //Multiply for 8 scenes
        rootMultiply8.getChildren().addAll(imageViewMultiplyFor8First, titleMultiply8First, Return_Askisi1_multiply8, btnMultiplyEightEx1, btnMultiplyEightEx2, btnMultiplyEightEx3);
        rootMultiply8Second.getChildren().addAll(imageViewMultiplyFor8Second, titleMultiply8Second, Return_Askisi1_multiply8Second, btnMultiplyEightEx1Second, btnMultiplyEightEx2Second, btnMultiplyEightEx3Second);
        rootMultiply8Third.getChildren().addAll(imageViewMultiplyFor8Third, titleMultiply8Third, Return_Askisi1_multiply8Third, btnMultiplyEightEx1Third, btnMultiplyEightEx2Third, btnMultiplyEightEx3Third);
        rootMultiply8Fourth.getChildren().addAll(imageViewMultiplyFor8Fourth, titleMultiply8Fourth, Return_Askisi1_multiply8Fourth, btnMultiplyEightEx1Fourth, btnMultiplyEightEx2Fourth, btnMultiplyEightEx3Fourth);
        rootMultiply8Fifth.getChildren().addAll(imageViewMultiplyFor8Fifth, titleMultiply8Fifth, Return_Askisi1_multiply8Fifth, btnMultiplyEightEx1Fifth, btnMultiplyEightEx2Fifth, btnMultiplyEightEx3Fifth);
        rootMultiply8Final.getChildren().addAll(imageViewMultiply8Final, titleMultiply8Final, Return_Askisi1_multiply8Final);
        //Multiply for 9 scenes
        rootMultiply9.getChildren().addAll(imageViewMultiplyFor9First, titleMultiply9First, Return_Askisi1_multiply9, btnMultiplyNineEx1, btnMultiplyNineEx2, btnMultiplyNineEx3);
        rootMultiply9Second.getChildren().addAll(imageViewMultiplyFor9Second, titleMultiply9Second, Return_Askisi1_multiply9Second, btnMultiplyNineEx1Second, btnMultiplyNineEx2Second, btnMultiplyNineEx3Second);
        rootMultiply9Third.getChildren().addAll(imageViewMultiplyFor9Third, titleMultiply9Third, Return_Askisi1_multiply9Third, btnMultiplyNineEx1Third, btnMultiplyNineEx2Third, btnMultiplyNineEx3Third);
        rootMultiply9Fourth.getChildren().addAll(imageViewMultiplyFor9Fourth, titleMultiply9Fourth, Return_Askisi1_multiply9Fourth, btnMultiplyNineEx1Fourth, btnMultiplyNineEx2Fourth, btnMultiplyNineEx3Fourth);
        rootMultiply9Fifth.getChildren().addAll(imageViewMultiplyFor9Fifth, titleMultiply9Fifth, Return_Askisi1_multiply9Fifth, btnMultiplyNineEx1Fifth, btnMultiplyNineEx2Fifth, btnMultiplyNineEx3Fifth);
        rootMultiply9Final.getChildren().addAll(imageViewMultiply9Final, titleMultiply9Final, Return_Askisi1_multiply9Final);
        //Multiply for 10 scenes
        rootMultiply10.getChildren().addAll(imageViewMultiplyFor10First, titleMultiply10First, Return_Askisi1_multiply10, btnMultiplyTenEx1, btnMultiplyTenEx2, btnMultiplyTenEx3);
        rootMultiply10Second.getChildren().addAll(imageViewMultiplyFor10Second, titleMultiply10Second, Return_Askisi1_multiply10Second, btnMultiplyTenEx1Second, btnMultiplyTenEx2Second, btnMultiplyTenEx3Second);
        rootMultiply10Third.getChildren().addAll(imageViewMultiplyFor10Third, titleMultiply10Third, Return_Askisi1_multiply10Third, btnMultiplyTenEx1Third, btnMultiplyTenEx2Third, btnMultiplyTenEx3Third);
        rootMultiply10Fourth.getChildren().addAll(imageViewMultiplyFor10Fourth, titleMultiply10Fourth, Return_Askisi1_multiply10Fourth, btnMultiplyTenEx1Fourth, btnMultiplyTenEx2Fourth, btnMultiplyTenEx3Fourth);
        rootMultiply10Fifth.getChildren().addAll(imageViewMultiplyFor10Fifth, titleMultiply10Fifth, Return_Askisi1_multiply10Fifth, btnMultiplyTenEx1Fifth, btnMultiplyTenEx2Fifth, btnMultiplyTenEx3Fifth);
        rootMultiply10Final.getChildren().addAll(imageViewMultiply10Final, titleMultiply10Final, Return_Askisi1_multiply10Final);

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
