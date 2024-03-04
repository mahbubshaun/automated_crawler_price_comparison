import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.DefaultCaret;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class crawler_4 {

	private JFrame frame;
	protected static boolean getm;
	protected static boolean cx;
	protected static boolean Getx;
	private static JProgressBar progressBar_1;
	private static JProgressBar progressBar_2;
	private static JProgressBar progressBar_3;
	private static JProgressBar progressBar_4;
	protected static ChromeDriver driver2;
	protected static ChromeOptions options2;
	public static JTextArea text;
	public static String path;

	public static ChromeOptions options;

	public static WebDriver driver;

	public static String l;

	public static String ip;
	static crawler_config sp = new crawler_config();
	public static String port;

	public static String user;

	public static String passw;
	public static ArrayList<String> ar = new ArrayList<String>();
	public static ArrayList<String> ar3 = new ArrayList<String>();

	public static ArrayList<String> li = new ArrayList<String>();

	public static ArrayList<String> li_g = new ArrayList<String>();

	public static ArrayList<String> li_c = new ArrayList<String>();
	public static int off;

	public static String addr;
	public static String l_cat;
	public static String country;
	public static boolean ex;
	public static String city;
	public static String state;
	protected static int p;

	public static String page_n;
	public static boolean re_p;
	public static int total;

	public static int p_w;
	private static JTextField txtProxypacketstreamio;

	public static int sa;

	public static boolean pr;

	public static int gi;
	private static Scanner sc2;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField txtMahbubahacershaun;
	private static Scanner sc;

	public static boolean auto;

	public static boolean manual;

	public static boolean fee;

	public static JProgressBar progressBar;

	public static JRadioButton rdbtnAutoLogin;

	public static JRadioButton rdbtnManualLogin;
	private static JTextField txtRecent;
	private static JTextField txtAllTime;
	private static JTextField textField_5;
	private static JTextField txtWarrantywarranty;

	public static String excel_sh;

	public static JComboBox comboBox;
	private static JTextField txtcefeabcfdfd;

	public static boolean cback;
	public static boolean shoop;
	public static boolean igr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					/*
					 * try { String text ="10.30"; String[] time = text.split ( "\\." ); String
					 * m=time[0].trim(); System.out.println("bbefore spliting " +m);
					 * }catch(Exception hh) { hh.printStackTrace(); }
					 * 
					 * try{ String st = "10.50"; System.out.println("bbefore spliting " +st);
					 * Thread.sleep(1000); String [] cas = st.split("\\.");
					 * 
					 * System.out.println("after spliting ar " +cas.toString() + "and string :"+st);
					 * Thread.sleep(1000); for(int h=0;h<cas.length;h++) {
					 * System.out.println("in loop :"+cas[h].trim().toString()); } String sec =
					 * cas[1];
					 * 
					 * String fir = cas[0];
					 * 
					 * System.out.println("spliting 0: " +sec);
					 * 
					 * if(sec.contains("0")) { sec=sec.replaceAll("0", " "); }
					 * 
					 * st=fir.concat("."+sec); System.out.println("after spliting 0: " +st);
					 * }catch(Exception ddg) { ddg.printStackTrace(); }
					 * 
					 * 
					 * /* if(st.endsWith("0")) { st = st.substring(0, st.indexOf("0")); }
					 * System.out.println(st);
					 */
					/*
					 * 
					 * String url = "https://www.shoop.de/cashback/asos"; System.out.
					 * println("Loading page now-----------------------------------------------: "
					 * +url);
					 * 
					 * final BrowserVersionBuilder myChromeBuilder = new
					 * BrowserVersion.BrowserVersionBuilder(BrowserVersion.CHROME); // do your setup
					 * here myChromeBuilder.
					 * setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36"
					 * ); // HtmlUnit emulation browser WebClient webClient = new
					 * WebClient(myChromeBuilder.build());
					 * webClient.getOptions().setJavaScriptEnabled(true); // Enable JS interpreter,
					 * default is true webClient.getOptions().setCssEnabled(true); // Disable css
					 * support webClient.getOptions().setThrowExceptionOnScriptError(false); //
					 * Whether to throw an exception when js runs incorrectly
					 * webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
					 * webClient.getOptions().setTimeout(10 * 1000); // Set the connection timeout
					 * HtmlPage page = webClient.getPage(url);
					 * webClient.waitForBackgroundJavaScript(50 * 1000); // Wait for js to execute
					 * in the background for 30 seconds
					 * 
					 * String pageAsXml = page.asXml();
					 * 
					 * // Jsoup parsing Document doc = Jsoup.parse(pageAsXml,
					 * "https://www.shoop.de/cashback/asos"); // Elements pngs =
					 * doc.select("img[src$=.png]"); // Get all image element sets // omit other
					 * operations here // System.out.println(doc.toString()); Elements linksOnPage2
					 * = doc.getAllElements();
					 * 
					 * // Elements linksOnPage2 =
					 * doc4.getElementsByAttributeValueContaining("class",
					 * "voucher-count text-highlight big ng-star-inserted");
					 * System.out.println(linksOnPage2.size()); for(int
					 * jj=0;jj<linksOnPage2.size();jj++) {
					 * 
					 * System.out.println(linksOnPage2.get(jj).toString());
					 * 
					 * }
					 */

					/*
					 * Document doc4 = Jsoup.connect("https://www.shoop.de/cashback/asos").
					 * userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.128 Safari/537.36"
					 * ) .referrer("http://www.google.com") .get();
					 * 
					 * Elements linksOnPage2 = doc4.getAllElements();
					 * 
					 * // Elements linksOnPage2 =
					 * doc4.getElementsByAttributeValueContaining("class",
					 * "voucher-count text-highlight big ng-star-inserted");
					 * System.out.println(linksOnPage2.size()); for(int
					 * jj=0;jj<linksOnPage2.size();jj++) {
					 * 
					 * System.out.println(linksOnPage2.get(jj).toString());
					 * 
					 * }
					 */

					gi = 0;
					crawler_4 window = new crawler_4();
					window.frame.setVisible(true);


					/*
					 * re (fw.getDefaultDirectory()+"\\fdd\\sc10.png");
					 * 
					 * Document document = new Document(); PdfWriter.getInstance(document, new
					 * FileOutputStream(fw.getDefaultDirectory()+"\\fddex.pdf")) ;
					 * 
					 * document.open(); Image image = Image.getInstance(fw.getDefaultDirectory()+
					 * "\\cropped\\Square.png");
					 * 
					 * //Image image = new Image(ImageDataFactory.create("")); //
					 * image.scaleToFit(document.getPageSize());
					 * 
					 * image.scaleAbsolute(PageSize.A4); image.setAbsolutePosition(0, 0);
					 * 
					 * // document.setPageSize(image); document.add(image); document.newPage();
					 * 
					 * document.close();
					 */

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public crawler_4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 673, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		txtRecent = new JTextField();
		txtRecent.setText("Recent");
		txtRecent.setBackground(Color.LIGHT_GRAY);
		txtRecent.setBounds(489, 178, 162, 19);
		// frame.getContentPane().add(txtRecent);
		txtRecent.setColumns(10);

		JLabel lblFilters = new JLabel("FILTERS");
		lblFilters.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilters.setForeground(Color.WHITE);
		lblFilters.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFilters.setBounds(490, 136, 161, 36);
		// frame.getContentPane().add(lblFilters);

		txtAllTime = new JTextField();
		txtAllTime.setText("All Time");
		txtAllTime.setColumns(10);
		txtAllTime.setBackground(Color.LIGHT_GRAY);
		txtAllTime.setBounds(489, 208, 162, 19);
		// frame.getContentPane().add(txtAllTime);

		JLabel lblComment = new JLabel("COMMENTS");
		lblComment.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment.setForeground(Color.WHITE);
		lblComment.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblComment.setBounds(489, 258, 161, 19);
		// frame.getContentPane().add(lblComment);

		textField_5 = new JTextField();
		textField_5.setText("20");
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(489, 284, 162, 19);
		frame.getContentPane().setLayout(null);
		// frame.getContentPane().add(textField_5);

		JLabel lblNewLabel = new JLabel("GSCI AUTOMATION SOFTWARE");
		lblNewLabel.setBounds(197, 17, 301, 27);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 366, 641, 102);
		frame.getContentPane().add(scrollPane);
		text = new JTextArea();
		DefaultCaret caret = (DefaultCaret) text.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		text.setBackground(Color.WHITE);
		text.setEditable(false);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setFont(new Font("Times New Roman", Font.BOLD, 15));
		scrollPane.setViewportView(text);

		JLabel lblRealTimeLog = new JLabel("REALTIME LOG");
		lblRealTimeLog.setBounds(10, 370, 641, 14);
		lblRealTimeLog.setForeground(Color.WHITE);
		lblRealTimeLog.setBackground(Color.YELLOW);
		lblRealTimeLog.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRealTimeLog.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblRealTimeLog);
		JLabel lblWordsToRemove = new JLabel("WORDS TO REMOVE");
		lblWordsToRemove.setBounds(10, 275, 154, 36);
		lblWordsToRemove.setHorizontalAlignment(SwingConstants.CENTER);
		lblWordsToRemove.setForeground(Color.WHITE);
		lblWordsToRemove.setFont(new Font("Times New Roman", Font.BOLD, 14));
		// frame.getContentPane().add(lblWordsToRemove);

		txtWarrantywarranty = new JTextField();
		txtWarrantywarranty.setBounds(10, 320, 150, 20);
		txtWarrantywarranty.setText("warranty,Warranty,returns,Returns,guarantee,Guarantee");
		txtWarrantywarranty.setColumns(10);
		txtWarrantywarranty.setBackground(Color.LIGHT_GRAY);
		// frame.getContentPane().add(txtWarrantywarranty);
		JLabel lblV = new JLabel("v 1.9");
		lblV.setBounds(10, 19, 72, 19);
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Times New Roman", Font.BOLD, 21));
		frame.getContentPane().add(lblV);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 61, 123, 47);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				try {
					Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");
				} catch (Exception hg) {

				}

				System.exit(0);

			}
		});
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("images/button (29).png")));

		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("PROXY");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(181, 224, 291, 27);
		// frame.getContentPane().add(lblNewLabel_4);

		txtProxypacketstreamio = new JTextField();
		txtProxypacketstreamio.setBackground(Color.GRAY);
		txtProxypacketstreamio.setBounds(181, 262, 291, 20);
		// frame.getContentPane().add(txtProxypacketstreamio);
		txtProxypacketstreamio.setColumns(10);
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "SELECT DELAY", "2", "4", "8", "16", "24", "48" }));
		comboBox.setBounds(197, 143, 301, 20);
		frame.getContentPane().add(comboBox);

		JLabel lblRefreshingDelayIn = new JLabel("WAITING DELAY");
		lblRefreshingDelayIn.setBounds(197, 97, 301, 14);
		lblRefreshingDelayIn.setForeground(Color.WHITE);
		lblRefreshingDelayIn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRefreshingDelayIn.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblRefreshingDelayIn);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("GETMORE");
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println("getmore checked");

					getm = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("getmore not checked");

					getm = false;
				}
			}

		});
		chckbxNewCheckBox_1.setBounds(197, 202, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("CASHBACK");
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println("cashback checked");

					cback = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("cashback not checked");

					cback = false;
				}
			}

		});
		chckbxNewCheckBox_2.setBounds(401, 202, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("SHOOP");
		chckbxNewCheckBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println("shoop checked");

					shoop = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("shoop not checked");

					shoop = false;
				}

			}
		});
		chckbxNewCheckBox_3.setBounds(197, 247, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("IGRAAL");
		chckbxNewCheckBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println(" igraal checked");

					igr = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("igraal not checked");

					igr = false;
				}
			}
		});
		chckbxNewCheckBox_4.setBounds(401, 247, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_4);

		progressBar_1 = new JProgressBar();
		progressBar_1.setToolTipText("ig");
		progressBar_1.setForeground(Color.BLACK);
		progressBar_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		progressBar_1.setStringPainted(true);
		progressBar_1.setBounds(63, 479, 588, 40);
		frame.getContentPane().add(progressBar_1);

		progressBar_2 = new JProgressBar();
		progressBar_2.setStringPainted(true);
		progressBar_2.setForeground(Color.BLACK);
		progressBar_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		progressBar_2.setBounds(63, 530, 588, 40);
		frame.getContentPane().add(progressBar_2);

		progressBar_3 = new JProgressBar();
		progressBar_3.setStringPainted(true);
		progressBar_3.setForeground(Color.BLACK);
		progressBar_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		progressBar_3.setBounds(63, 581, 588, 40);
		frame.getContentPane().add(progressBar_3);

		progressBar_4 = new JProgressBar();
		progressBar_4.setStringPainted(true);
		progressBar_4.setForeground(Color.BLACK);
		progressBar_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		progressBar_4.setBounds(63, 633, 588, 40);
		frame.getContentPane().add(progressBar_4);

		JLabel lblIg = new JLabel("IG");
		lblIg.setHorizontalAlignment(SwingConstants.CENTER);
		lblIg.setForeground(Color.WHITE);
		lblIg.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIg.setBounds(10, 490, 43, 27);
		frame.getContentPane().add(lblIg);

		JLabel lblCash = new JLabel("CASH");
		lblCash.setHorizontalAlignment(SwingConstants.CENTER);
		lblCash.setForeground(Color.WHITE);
		lblCash.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCash.setBounds(10, 541, 43, 27);
		frame.getContentPane().add(lblCash);

		JLabel lblGet = new JLabel("GET");
		lblGet.setHorizontalAlignment(SwingConstants.CENTER);
		lblGet.setForeground(Color.WHITE);
		lblGet.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGet.setBounds(10, 592, 43, 27);
		frame.getContentPane().add(lblGet);

		JLabel lblShop = new JLabel("SHOP");
		lblShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblShop.setForeground(Color.WHITE);
		lblShop.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblShop.setBounds(10, 636, 43, 27);
		frame.getContentPane().add(lblShop);

		JLabel label_1 = new JLabel("2CAPTCHA API KEY");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_1.setBounds(10, 146, 149, 14);
		frame.getContentPane().add(label_1);

		txtcefeabcfdfd = new JTextField();
		txtcefeabcfdfd.setColumns(10);
		txtcefeabcfdfd.setBackground(Color.WHITE);
		txtcefeabcfdfd.setBounds(10, 182, 149, 19);
		frame.getContentPane().add(txtcefeabcfdfd);

		JCheckBox chckbxCashbackEx = new JCheckBox("CASHBACK EX");
		chckbxCashbackEx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println(" CASHBACK EX checked");

					cx = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("igraal not checked");

					cx = false;
				}
			}
		});
		chckbxCashbackEx.setBounds(10, 268, 123, 23);
		frame.getContentPane().add(chckbxCashbackEx);

		JCheckBox chckbxGetmoreEx = new JCheckBox("GETMORE EX");
		chckbxGetmoreEx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println(" Getmoore checked");

					Getx = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("Getmoore not checked");

					Getx = false;
				}
			}
		});
		chckbxGetmoreEx.setBounds(10, 320, 123, 23);
		frame.getContentPane().add(chckbxGetmoreEx);

		textField = new JTextField();
		textField.setBounds(174, 264, 305, 20);
		textField.setForeground(Color.YELLOW);
		textField.setColumns(10);
		textField.setBackground(Color.GRAY);

		JLabel lblCode = new JLabel("CODE");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setForeground(Color.WHITE);
		lblCode.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCode.setBounds(181, 203, 298, 14);
		// frame.getContentPane().add(lblCode);

		textField_1 = new JTextField();
		textField_1.setForeground(Color.YELLOW);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.GRAY);
		textField_1.setBounds(181, 233, 298, 20);
		// frame.getContentPane().add(textField_1);

		JLabel lblNewLabel_5 = new JLabel("2CAPTCHA API");
		lblNewLabel_5.setBounds(10, 136, 150, 36);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		// frame.getContentPane().add(lblNewLabel_5);

		txtMahbubahacershaun = new JTextField();
		txtMahbubahacershaun.setBounds(10, 178, 150, 20);
		// txtMahbubahacershaun.setText("mahbub1996a:Hacershaun1");
		txtMahbubahacershaun.setBackground(Color.LIGHT_GRAY);
		// frame.getContentPane().add(txtMahbubahacershaun);
		txtMahbubahacershaun.setColumns(10);

		rdbtnAutoLogin = new JRadioButton("AUTO LOGIN");
		rdbtnAutoLogin.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				JRadioButton chckbxIgnoreFullQc = (JRadioButton) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println("checked");

					auto = true;
				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("not checked");

					auto = false;
				}
			}
		});
		rdbtnAutoLogin.setBounds(10, 280, 150, 23);
		// frame.getContentPane().add(rdbtnAutoLogin);

		rdbtnManualLogin = new JRadioButton("MANUAL LOGIN");
		rdbtnManualLogin.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				JRadioButton chckbxIgnoreFullQc = (JRadioButton) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println("checked");

					manual = true;

					System.out.println("Application path is: " + path);
					System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					Proxy proxy = new Proxy();
					proxy.setHttpProxy(ip + ":" + port);
					proxy.setSslProxy(ip + ":" + port);

					// proxy.setSocksUsername("J1CVZBUI");
					// proxy.setSocksPassword("5ACO19PR");
					DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					capabilities.setCapability("proxy", proxy);

					DesiredCapabilities jsCapabilities = DesiredCapabilities.chrome();
					ChromeOptions options2 = new ChromeOptions();
					options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options2.setExperimentalOption("useAutomationExtension", false);
					// options2.addArguments("user-agent=Mozilla/5.0 (Windows NT
					// 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)
					// Chrome/81.0.4044.122 Safari/537.36");
					options2.addArguments("--disable-blink-features=AutomationControlled");
					options2.setCapability("requireWindowFocus", true);
					options2.addArguments("--ignore-certificate-errors");
					options2.addArguments("start-maximized");

					options2.addArguments("--user-data-dir=" + path + "/tipestry");
					// options2.addExtensions(new
					// File(""+path+"//chromedriver//Proxy-Auto-Auth_v2.0.crx"));

					Map<String, Object> prefs4 = new LinkedHashMap<String, Object>();
					prefs4.put("profile.default_content_setting_values.images", 2);

					capabilities.setCapability(ChromeOptions.CAPABILITY, options2);

					driver2 = new ChromeDriver(capabilities);

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("not checked");

					manual = false;
				}
			}
		});
		rdbtnManualLogin.setBounds(10, 327, 150, 23);
		// frame.getContentPane().add(rdbtnManualLogin);
		UIManager.put("ProgressBar.background", Color.orange);
		UIManager.put("ProgressBar.foreground", Color.black);
		UIManager.put("ProgressBar.selectionBackground", Color.red);
		UIManager.put("ProgressBar.selectionForeground", Color.green);

		progressBar = new JProgressBar();
		progressBar.setBounds(10, 527, 641, 47);
		progressBar.setForeground(Color.BLACK);
		progressBar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		progressBar.setStringPainted(true);

		// progressBar.setIndeterminate(true);
		// frame.getContentPane().add(progressBar);
		// frame.pack();
		JCheckBox chckbxNewCheckBox = new JCheckBox("USE PROXY?");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();

				// The item affected by the event.
				Object item = e.getItem();

				if (e.getStateChange() == ItemEvent.SELECTED) {
					// textField.setText(item.toString());

					System.out.println("checked");

					// sp.SaveProp("AUTO_START", "true");
					pr = true;

				}

				if (e.getStateChange() == ItemEvent.DESELECTED) {
					// textArea.setText(item.toString() + " deselected.");

					System.out.println("not checked");
					// sp.SaveProp("AUTO_START", "false");
					pr = false;
				}

			}
		});
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(506, 261, 116, 23);
		// frame.getContentPane().add(chckbxNewCheckBox);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					// System.setProperty("webdriver.chrome.driver",""+path+"\\chromedriver\\chromedriver.exe");
					System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

					ChromeOptions options2 = new ChromeOptions();
					options2.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options2.setExperimentalOption("useAutomationExtension", false);
					// options2.addArguments("user-agent=Mozilla/5.0 (Windows NT
					// 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)
					// Chrome/81.0.4044.122 Safari/537.36");
					options2.addArguments("--disable-blink-features=AutomationControlled");
					options2.setCapability("requireWindowFocus", true);
					options2.addArguments("--ignore-certificate-errors");

					JFileChooser fr = new JFileChooser();
					FileSystemView fw = fr.getFileSystemView();

					File direc = fw.getDefaultDirectory();
					System.out.println(fw.getDefaultDirectory());
					options2.addArguments("user-data-dir=" + fw.getDefaultDirectory() + "\\googlemap");

					// options2.addArguments("user-data-dir="+path+"\\googlemap");

					// capabilities.setCapability(ChromeOptions.CAPABILITY,
					// options);
					driver2 = new ChromeDriver(options2);

					driver2.get(
							"https://stackoverflow.com/users/signup?ssrc=head&returnurl=%2fusers%2fstory%2fcurrent");

					driver2.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/button[1]")).click();

				} catch (Exception hh) {
					hh.printStackTrace();
				}

			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(489, 55, 172, 43);
		// frame.getContentPane().add(lblNewLabel_3);

		lblNewLabel_3.setIcon(new ImageIcon(getClass().getResource("images/configure.png")));

		lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JLabel label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(0, -13, 617, 592);
		// frame.getContentPane().add(label);

		ImageIcon img = new ImageIcon(getClass().getResource("images/f.png"));

		frame.setIconImage(img.getImage());

		label.setIcon(new ImageIcon(getClass().getResource("images/ps.jpg")));

		final JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(197, 308, 301, 47);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				String value1 = comboBox.getSelectedItem().toString();

				if ((value1.equals("SELECT DELAY")) || txtcefeabcfdfd.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please select waiting delay / Insert 2captcha api key");
				} else {

					// path=textField.getText();
					/*
					 * if(textField_3.getText().isEmpty() ||
					 * txtTestingaccountahnahadafg.getText().isEmpty() ||
					 * txtMahbubahacershaun.getText().isEmpty() || textField.getText().isEmpty() ||
					 * (auto == false && manual == false) ) { JOptionPane.showMessageDialog(
					 * null,"Please import an excel sheet / insert url / insert login  / insert dbc login"
					 * );
					 * 
					 * } else{
					 * 
					 * 
					 * String fileName = textField_3.getText(); File file = new File(fileName);
					 * 
					 * // try to rename the file with the same name File sameFileName = new
					 * File(fileName);
					 * 
					 * if(file.renameTo(sameFileName)){ // if the file is renamed
					 * System.out.println("file is closed"); }else{ // if the file didnt accept the
					 * renaming operation System.out.println("file is opened"); try { String
					 * processName = "EXCEL.EXE"; Runtime rt = Runtime.getRuntime(); // For Windows
					 * OS... if (System.getProperty("os.name").toLowerCase().contains( "windows")) {
					 * rt.exec("taskkill /T /F /IM " + processName);
					 * //rt.exec("taskkill /T /F /PID " + Long.parseLong(processName)); // Supply
					 * the PID value as string //rt.exec("taskkill /F /FI \"WINDOWTITLE eq " +
					 * processName + "\" /T"); // Supply the window title bar text. // If you want
					 * to kill only a single instance of the // named process then get its PID value
					 * and use: // "taskkill /T /F /PID PID_Value" OR you can provide // the window
					 * title and use: // "taskkill /F /FI \"WINDOWTITLE eq " + processName + "\" /T"
					 * } // For OSX And Linux OS's... else { rt.exec("sudo killall -9 '" +
					 * processName + "'"); //rt.exec("kill -9 " + Long.parseLong(processName)); //
					 * Supply the PID value as string // If you want to kill only a single instance
					 * of the // named process then get its PID value and use: //
					 * "kill -9 PID_Value" } rt.freeMemory();
					 * 
					 * } catch (IOException | SecurityException | IllegalArgumentException ex) {
					 * ex.printStackTrace(); }
					 * 
					 * }
					 * 
					 * 
					 * sp.SaveProp("EXCEL","URL","DBC","LOGIN","AUTO","MANUAL",
					 * textField_3.getText(),textField.getText(),
					 * txtMahbubahacershaun.getText(),txtTestingaccountahnahadafg.
					 * getText(),String.valueOf(auto), String.valueOf(manual));
					 */

					// sp.SaveProp("EXCEL","URL","DBC","LOGIN",
					// textField_3.getText(),textField.getText(),
					// txtMahbubahacershaun.getText(),txtTestingaccountahnahadafg.
					// getText());
					// rebeet();

					rep_t();

					JOptionPane.showMessageDialog(null, "Bot started!");
				}
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("images/button (38).png")));
		frame.getContentPane().add(lblNewLabel_1);
	}

	public static void cash() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					// int w=rowa;
					// System.out.println("row is: "+w);
					/*
					 * int w=1; row=sheet.getRow(w); if(row == null) { row = sheet.createRow(w); }
					 * cell = row.getCell(0); if(cell == null) {
					 * 
					 * } else{
					 */

					// w = sheet.getLastRowNum()+10;
					// JOptionPane.showMessageDialog(null,"All the rows have
					// been completed");
					Random r = new Random();
					int low = 1000;
					int high = 5000;

					int waits = r.nextInt(high - low) + low;

					// Thread.sleep(waits);

					// }else{

					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					if (System.getProperty("os.name").contains("Windows")) {
						System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

					} else {
						System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
					}
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					ChromeOptions options = new ChromeOptions();
					// options.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\covina");
					// options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)
					// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
					options.addArguments("--disable-blink-features=AutomationControlled");
					/* connecting to existing chrome session */
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options.setExperimentalOption("useAutomationExtension", false);
					// options.setExperimentalOption("debuggerAddress","localhost:3150");
					options.addExtensions(new File(path + "/chromedriver/captcha.crx"));
					// options.addExtensions(new
					// File(path+"/chromedriver/Proxy-Auto-Auth_v2.0.crx"));
					// options.addArguments("load-extension="+path+"/chromedriver/cap");
					options.addArguments("start-maximized");

					options.addArguments("user-data-dir=" + path + "/cash");
					// options.addArguments("window-size=1366,768");
					// options.addArguments("--lang=en-US");
					Thread.sleep(2000);
					driver = new ChromeDriver(options);

					WebDriverWait wait1 = new WebDriverWait(driver, 40);

					Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

					String t2 = String.valueOf(timestamp2);

					String stt = "[" + t2 + "] Cashbackdeals:  Going to cashbackdeals";
					update(stt);

					driver.get("https://www.cashbackdeals.de/shops/shops.php?url_key=all");

					DateTime dt = new DateTime();
					int hours = dt.getHourOfDay(); // gets hour of day

					int min = dt.getMinuteOfHour();

					int seconds = dt.getSecondOfMinute();

					int YEAR = dt.getYear();

					int month = dt.getMonthOfYear();

					int day = dt.getDayOfMonth();

					JavascriptExecutor js = (JavascriptExecutor) driver;

					for (int i = 0; i < 300; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}
						// To check page ready state.
						if (js.executeScript("return document.readyState").toString().equals("complete")) {
							System.out.println("page loaded ");
							break;
						}
					}

					List<WebElement> cash_l = driver.findElements(By.xpath("//ol[@class='all-stores-list']/li"));

					System.out.println("numer of listing found : " + cash_l.size());

					timestamp2 = new Timestamp(System.currentTimeMillis());

					t2 = String.valueOf(timestamp2);

					stt = "[" + t2 + "] Cashbackdeals:  Total listing found: " + cash_l.size();
					update(stt);
					progressBar_2.setMaximum(cash_l.size());
					progressBar_2.update(progressBar_2.getGraphics());
					for (int i = 1; i <= cash_l.size(); i++) {
						WebElement sh = driver.findElement(By.xpath(
								"(//ol[@class='all-stores-list']/li)[" + i + "]//span[@class='allStoreLogo']/img"));

						System.out.println(sh.getAttribute("alt"));

						String tw = sh.getAttribute("alt");

						tw = tw.replaceAll("\\s+", "");
						try {

							tw = tw.replaceAll(".de", "");
						} catch (Exception fhjh) {

						}
						try {
							tw = tw.replaceAll(".com", "");
						} catch (Exception fhj) {

						}
						// WebElement casc =
						// driver.findElement(By.xpath("(//ol[@class='all-stores-list']/li)["+i+"]//span[@class='allStoreLogo']"));

						WebElement element = driver.findElement(By.xpath(
								"(//ol[@class='all-stores-list']/li)[" + i + "]//span[@class='allStoreLogo']/span"));
						String text = (String) js.executeScript("return arguments[0].innerHTML;", element);

						String st = text;

						System.out.println("cashback: " + st);
						st = st.replaceAll("CashCoins", "");
						/*
						 * String tmp = st;
						 * 
						 * st=st.replaceAll("\\d", "");
						 * 
						 * System.out.println("namne extracted: "+st); String text =tmp; String[] time =
						 * text.split ( "," ); String h=time[0].trim(); String h2=time[1].trim();
						 * 
						 * h= h.replaceAll("\\D+",""); h2=h2.replaceAll("\\D+","");
						 * 
						 * String fin = h.concat("."+h2); // tmp=tmp.concat("."+h2);;
						 * 
						 * // tmp = tmp.replaceAll("\\D+","");
						 * 
						 * System.out.println("cashback %: "+fin);
						 */
						st = st.replaceAll(",", ".");
						if (st.contains("%")) {
							st = st.replaceAll("%", "");
							String hhs = "";
							String inf = "";
							if (st.contains("bis zu")) {
								st = st.replaceAll("bis zu", "");
								hhs = "bis zu";
								inf = "yes";
							}

							try {
								st = st.replaceAll(".00", " ");

							} catch (Exception ddg) {

							}
							/*
							 * if(st.endsWith("0")) { st = st.substring(0, st.indexOf("0")); }
							 */

							try {
								System.out.println("bbefore spliting " + st);
								String[] ca = st.split("\\.");
								System.out.println("after spliting ar " + ca.length + "and string :" + st);
								for (int h = 0; h < ca.length; h++) {
									System.out.println("in loop :" + ca[h].trim().toString());
								}

								String sec = ca[1];

								String fir = ca[0];

								System.out.println("spliting 0: " + sec);

								if (sec.contains("0")) {
									sec = sec.replaceAll("0", " ");
								}

								st = fir.concat("." + sec);
								System.out.println("after spliting 0: " + st);
							} catch (Exception ddg) {
								ddg.printStackTrace();
							}

							String da = String.valueOf(day).concat("/" + String.valueOf(month))
									.concat("/" + String.valueOf(YEAR));
							try {
								Connection myConn = null;

								Statement myStmt = null;
								ResultSet myRs = null;

								String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
								String user = "multitem_test";
								String pass = "test123";
								myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
								myStmt = (Statement) myConn.createStatement();
								String sql2 = "SELECT ShopNameEx FROM Cashbackdeals WHERE ShopNameEx='"
										+ sh.getAttribute("alt") + "'";
								myRs = myStmt.executeQuery(sql2);

								if ((myRs.next())) {

									String up = "UPDATE Cashbackdeals  SET CashBack='" + st + "',InfoIfDiff='" + inf
											+ "',Date='" + da + "' WHERE ShopNameEx='" + sh.getAttribute("alt") + "'";

									int my = myStmt.executeUpdate(up);

									if (my > 0) {

										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Cashbackdeals: Listing already exist so updated the db";
										update(stt);
									}
								} else {

									String sql = "INSERT INTO Cashbackdeals (ShopName,ShopNameEx,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Date) VALUES ('"
											+ tw + "','" + sh.getAttribute("alt") + "','" + st + "','','','" + inf
											+ "','','" + da + "')";
									int myRss = myStmt.executeUpdate(sql);

									if (myRss > 0) {
										System.out.println("value inserted to database");

										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Cashbackdeals:  Listing inserted";
										update(stt);
									} else {
										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Cashbackdeals:  Something went wrong";
										update(stt);
									}
								}

								myConn.close();
								myStmt.close();

								// myRs.close();

							} catch (Exception b) {
								b.printStackTrace();
							}
						} else {
							String hhs = "";
							String inf = "";
							if (st.contains("bis zu")) {
								st = st.replaceAll("bis zu", "");
								hhs = "bis zu";
								inf = "yes";
							}

							try {
								st = st.replaceAll(".00", " ");

							} catch (Exception ddg) {

							}

							/*
							 * if(st.endsWith("0")) { st = st.substring(0, st.indexOf("0")); }
							 */

							try {
								System.out.println("bbefore spliting " + st);
								String[] ca = st.split("\\.");
								System.out.println("after spliting ar " + ca.toString() + "and string :" + st);

								for (int h = 0; h < ca.length; h++) {
									System.out.println("in loop :" + ca[h].trim().toString());
								}
								String sec = ca[1];

								String fir = ca[0];

								System.out.println("spliting 0: " + sec);

								if (sec.contains("0")) {
									sec = sec.replaceAll("0", " ");
								}

								st = fir.concat("." + sec);
								System.out.println("after spliting 0: " + st);
							} catch (Exception ddg) {
								ddg.printStackTrace();
							}

							String da = String.valueOf(day).concat("/" + String.valueOf(month))
									.concat("/" + String.valueOf(YEAR));
							try {
								Connection myConn = null;

								Statement myStmt = null;
								ResultSet myRs = null;

								String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
								String user = "multitem_test";
								String pass = "test123";
								myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
								myStmt = (Statement) myConn.createStatement();
								String sql2 = "SELECT ShopNameEx FROM Cashbackdeals WHERE ShopNameEx='"
										+ sh.getAttribute("alt") + "'";
								myRs = myStmt.executeQuery(sql2);

								if ((myRs.next())) {

									String up = "UPDATE Cashbackdeals  SET CashBackEuro='" + st + "',InfoIfDiff='" + inf
											+ "',Date='" + da + "' WHERE ShopNameEx='" + sh.getAttribute("alt") + "'";

									int my = myStmt.executeUpdate(up);

									if (my > 0) {

										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Cashbackdeals: Listing already exist so updated the db";
										update(stt);
									}
								} else {

									String sql = "INSERT INTO Cashbackdeals (ShopName,ShopNameEx,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Date) VALUES ('"
											+ tw + "','" + sh.getAttribute("alt") + "','','" + st + "','','" + inf
											+ "','','" + da + "')";
									int myRss = myStmt.executeUpdate(sql);

									if (myRss > 0) {
										System.out.println("value inserted to database");

										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Cashbackdeals:  Listing inserted";
										update(stt);
									} else {
										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Cashbackdeals:  Something went wrong";
										update(stt);
									}
								}

								myConn.close();
								myStmt.close();

								// myRs.close();

							} catch (Exception b) {
								b.printStackTrace();
							}
						}
						progressBar_2.setValue(i);
						;
						progressBar_2.update(progressBar_2.getGraphics());
					}

					String value1 = comboBox.getSelectedItem().toString();
					timestamp2 = new Timestamp(System.currentTimeMillis());

					t2 = String.valueOf(timestamp2);

					stt = "[" + t2 + "] Cashbackdeals:  Bot is waiting for " + value1 + " hours";
					update(stt);
					driver.close();

					driver.quit();

					Thread.sleep(5000);

					// cash();

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static void get() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					// int w=rowa;
					// System.out.println("row is: "+w);
					/*
					 * int w=1; row=sheet.getRow(w); if(row == null) { row = sheet.createRow(w); }
					 * cell = row.getCell(0); if(cell == null) {
					 * 
					 * } else{
					 */

					// w = sheet.getLastRowNum()+10;
					// JOptionPane.showMessageDialog(null,"All the rows have
					// been completed");
					Random r = new Random();
					int low = 1000;
					int high = 5000;

					int waits = r.nextInt(high - low) + low;

					// Thread.sleep(waits);

					// }else{

					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					if (System.getProperty("os.name").contains("Windows")) {
						System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

					} else {
						System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
					}
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					ChromeOptions options = new ChromeOptions();
					// options.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\covina");
					// options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)
					// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
					options.addArguments("--disable-blink-features=AutomationControlled");
					/* connecting to existing chrome session */
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options.setExperimentalOption("useAutomationExtension", false);
					// options.setExperimentalOption("debuggerAddress","localhost:3150");
					options.addExtensions(new File(path + "/chromedriver/captcha.crx"));
					// options.addExtensions(new
					// File(path+"/chromedriver/Proxy-Auto-Auth_v2.0.crx"));
					// options.addArguments("load-extension="+path+"/chromedriver/cap");
					options.addArguments("start-maximized");
					options.setCapability("requireWindowFocus", true);
					options.addArguments("user-data-dir=" + path + "/get");
					// options.addArguments("window-size=1366,768");
					// options.addArguments("--lang=en-US");
					Thread.sleep(2000);
					WebDriver driver_g = new ChromeDriver(options);

					WebDriverWait wait1 = new WebDriverWait(driver_g, 40);

					Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

					String t2 = String.valueOf(timestamp2);

					String stt = "[" + t2 + "] Getmore:  Going to Getmore";
					update(stt);

					driver_g.get("https://www.getmore.de/shops/partner/");

					DateTime dt = new DateTime();
					int hours = dt.getHourOfDay(); // gets hour of day

					int min = dt.getMinuteOfHour();

					int seconds = dt.getSecondOfMinute();

					int YEAR = dt.getYear();

					int month = dt.getMonthOfYear();

					int day = dt.getDayOfMonth();

					JavascriptExecutor js = (JavascriptExecutor) driver_g;

					for (int i = 0; i < 300; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}
						// To check page ready state.
						if (js.executeScript("return document.readyState").toString().equals("complete")) {
							System.out.println("page loaded ");
							break;
						}
					}
					Actions m = new Actions(driver_g);

					String num_a = driver_g.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/h1")).getText();

					num_a = num_a.replaceAll("\\D+", "");

					int num_i = Integer.parseInt(num_a);

					for (int c = 0; c < 10; c++) {
						// List<WebElement> number2 =
						// driver_g.findElements(By.xpath("//div[@class='col-12 col-lg-8 col-shop']"));
						// WebElement gh = driver_g.findElement(By.xpath("/html/body/footer"));

						List<WebElement> number = driver_g
								.findElements(By.xpath("//div[@class='col-12 col-lg-8 col-shop']"));

						System.out.println("number of listings: " + number.size());

						m.moveToElement(number.get(number.size() - 1)).build().perform();

						if (number.size() >= num_i) {
							break;
						} else {
							c = 0;
						}
						timestamp2 = new Timestamp(System.currentTimeMillis());

						t2 = String.valueOf(timestamp2);

						stt = "[" + t2 + "] Getmore:  Loading all listings";
						update(stt);
						js.executeScript("window.scrollBy(0,500)");

						Thread.sleep(2000);

					}

					List<WebElement> cash_l = driver_g
							.findElements(By.xpath("//div[@class='col-12 col-lg-8 col-shop']"));

					System.out.println("numer of listing found : " + cash_l.size());

					timestamp2 = new Timestamp(System.currentTimeMillis());

					t2 = String.valueOf(timestamp2);

					stt = "[" + t2 + "] Getmore:  All listings loaded, total listing found: " + cash_l.size();
					update(stt);
					progressBar_3.setMaximum(cash_l.size());
					progressBar_3.update(progressBar_3.getGraphics());
					for (int i = 1; i <= cash_l.size(); i++) {
						try {
							WebElement tit = driver_g.findElement(By.xpath(
									"(//div[@class='col-12 col-lg-8 col-shop'])[" + i + "]//div[@class='shop-title']"));
							m.moveToElement(tit).build().perform();
							System.out.println(tit.getText());

							String tw = tit.getText();
							tw = tw.replaceAll("\\s+", "");

							try {

								tw = tw.replaceAll(".de", "");
							} catch (Exception fhjh) {

							}
							try {
								tw = tw.replaceAll(".com", "");
							} catch (Exception fhj) {

							}
							WebElement cash = driver_g.findElement(By.xpath(
									"(//div[@class='col-12 col-lg-8 col-shop'])[" + i + "]//span[@class='cashback']"));
							m.moveToElement(cash).build().perform();
							System.out.println(cash.getText());

							String bon = "";
							try {

								WebElement ca_bo = driver_g
										.findElement(By.xpath("(//div[@class='col-12 col-lg-8 col-shop'])[" + i
												+ "]//span[@class='cashback-condition']"));
								bon = ca_bo.getText();

								bon = bon.replaceAll("\\D+", "");
							} catch (Exception fg) {

							}
							WebElement link = driver_g
									.findElement(By.xpath("(//div[@class='col-12 col-lg-8 col-shop'])[" + i + "]/a"));

							System.out.println(link.getAttribute("href"));

							String inf = "";

							try {
								String bis = driver_g.findElement(By.xpath(
										"(//div[@class='col-12 col-lg-8 col-shop'])[" + i + "]//span[@class='prefix']"))
										.getText();

								try {
									if (bis.contains("BIS ZU")) {

										inf = "yes";

									}
								} catch (Exception fh) {

								}

							} catch (Exception hfh) {
								hfh.printStackTrace();
							}
							System.out.println(inf);

							WebElement cash_bon = driver_g.findElement(By.xpath(
									"(//div[@class='col-12 col-lg-8 col-shop'])[" + i + "]//span[@class='postfix']"));

							System.out.println(cash_bon.getText());
							String da = String.valueOf(day).concat("/" + String.valueOf(month))
									.concat("/" + String.valueOf(YEAR));

							String cc = cash.getText();
							if (cc.contains("%")) {

								try {
									cc = cc.replaceAll(",", ".");
								} catch (Exception fhh) {

								}

								try {
									cc = cc.replaceAll("%", "");
								} catch (Exception fh) {

								}

								try {
									cc = cc.replaceAll(".00", "");

								} catch (Exception ddg) {

								}

								try {
									String[] ca = cc.split(".");

									String sec = ca[1];

									String fir = ca[0];

									if (sec.contains("0")) {
										sec = sec.replaceAll("0", "");
									}

									cc = fir.concat(sec);

								} catch (Exception ddg) {

								}

								if (cash_bon.getText().equals("CASHBACK")) {
									try {
										Connection myConn = null;

										Statement myStmt = null;
										ResultSet myRs = null;

										String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
										String user = "multitem_test";
										String pass = "test123";
										myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
										myStmt = (Statement) myConn.createStatement();

										String sql2 = "SELECT Link_C FROM Getmore WHERE Link_C ='"
												+ link.getAttribute("href") + "'";
										myRs = myStmt.executeQuery(sql2);

										if ((myRs.next())) {

											String up = "UPDATE Getmore SET CashBack='" + cc + "',Bonus='" + bon
													+ "',InfoIfDiff='" + inf + "',Date='" + da + "' WHERE Link_C='"
													+ link.getAttribute("href") + "'";

											int my = myStmt.executeUpdate(up);

											if (my > 0) {
												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore: Listing already exist so updated the db";
												update(stt);
											}
										} else {
											String sql = "INSERT INTO Getmore (ShopName,CashBack,CashBackEuro,Bonus,BonusEuro,InfoIfDiff,Link,Link_C,Date) VALUES ('"
													+ tw + "','" + cc + "','','" + bon + "','','" + inf + "','','"
													+ link.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												System.out.println("value inserted to database");
												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore:  Listing inserted successfully";
												update(stt);
											} else {
												// System.out.println("something is wrong");
												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore:  Something went wrong";
												update(stt);
											}
										}

										myConn.close();
										myStmt.close();

										// myRs.close();

									} catch (Exception b) {
										b.printStackTrace();
									}
								} else {
									try {
										Connection myConn = null;

										Statement myStmt = null;
										ResultSet myRs = null;

										String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
										String user = "multitem_test";
										String pass = "test123";
										myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
										myStmt = (Statement) myConn.createStatement();
										String sql = "INSERT INTO Getmore (ShopName,CashBack,Bonus,InfoIfDiff,Link,Date) VALUES ('"
												+ tw + "','','" + cc + "','" + inf + "','" + link.getAttribute("href")
												+ "','" + da + "')";
										int myRss = myStmt.executeUpdate(sql);

										if (myRss > 0) {

											timestamp2 = new Timestamp(System.currentTimeMillis());

											t2 = String.valueOf(timestamp2);

											stt = "[" + t2 + "] Getmore:  Listing inserted successfully";
											update(stt);
										} else {
											timestamp2 = new Timestamp(System.currentTimeMillis());

											t2 = String.valueOf(timestamp2);

											stt = "[" + t2 + "] Getmore:  Something went wrong";
											update(stt);
										}

										myConn.close();
										myStmt.close();

										// myRs.close();

									} catch (Exception b) {
										b.printStackTrace();
									}
								}
							} else {
								try {
									String bis = driver_g
											.findElement(By.xpath("(//div[@class='col-12 col-lg-8 col-shop'])[" + i
													+ "]//span[@class='prefix']"))
											.getText();

									try {
										if (bis.contains("BIS ZU")) {

											inf = "yes";

										}
									} catch (Exception fh) {

									}

								} catch (Exception hfh) {
									hfh.printStackTrace();
								}
								System.out.println("info is:" + inf);
								try {
									cc = cc.replaceAll(",", ".");
								} catch (Exception fhh) {

								}

								if (cc.contains("%")) {
									try {
										cc = cc.replaceAll("%", "");
									} catch (Exception fh) {

									}

									if (cash_bon.getText().equals("CASHBACK")) {
										try {
											Connection myConn = null;

											Statement myStmt = null;
											ResultSet myRs = null;

											String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
											String user = "multitem_test";
											String pass = "test123";
											myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
											myStmt = (Statement) myConn.createStatement();

											String sql2 = "SELECT Link_C FROM Getmore WHERE Link_C ='"
													+ link.getAttribute("href") + "'";
											myRs = myStmt.executeQuery(sql2);

											if ((myRs.next())) {

												String up = "UPDATE Getmore SET CashBack='" + cc + "',Bonus='" + bon
														+ "',InfoIfDiff='" + inf + "',Date='" + da + "' WHERE Link_C='"
														+ link.getAttribute("href") + "'";

												int my = myStmt.executeUpdate(up);

												if (my > 0) {

													timestamp2 = new Timestamp(System.currentTimeMillis());

													t2 = String.valueOf(timestamp2);

													stt = "[" + t2
															+ "] Getmore: Listing already exist so updated the db";
													update(stt);
												}
											} else {
												String sql = "INSERT INTO Getmore (ShopName,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Link_C,Date) VALUES ('"
														+ tw + "','" + cc + "','','','" + inf + "','','"
														+ link.getAttribute("href") + "','" + da + "')";
												int myRss = myStmt.executeUpdate(sql);

												if (myRss > 0) {
													System.out.println("value inserted to database");
													timestamp2 = new Timestamp(System.currentTimeMillis());

													t2 = String.valueOf(timestamp2);

													stt = "[" + t2 + "] Getmore:  Listing inserted successfully";
													update(stt);
												} else {
													// System.out.println("something is wrong");
													timestamp2 = new Timestamp(System.currentTimeMillis());

													t2 = String.valueOf(timestamp2);

													stt = "[" + t2 + "] Getmore:  Something went wrong";
													update(stt);
												}
											}

											myConn.close();
											myStmt.close();

											// myRs.close();

										} catch (Exception b) {
											b.printStackTrace();
										}
									} else {
										try {
											Connection myConn = null;

											Statement myStmt = null;
											ResultSet myRs = null;

											String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
											String user = "multitem_test";
											String pass = "test123";
											myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
											myStmt = (Statement) myConn.createStatement();
											String sql = "INSERT INTO Getmore (ShopName,CashBack,CashEuro,Bonus,InfoIfDiff,Link,Date) VALUES ('"
													+ tw + "','','" + cc + "','" + bon + "','" + inf + "','"
													+ link.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {

												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore:  Listing inserted successfully";
												update(stt);
											} else {
												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore:  Something went wrong";
												update(stt);
											}

											myConn.close();
											myStmt.close();

											// myRs.close();

										} catch (Exception b) {
											b.printStackTrace();
										}
									}
								} else {

									try {
										cc = cc.replaceAll("€", "");
									} catch (Exception fh) {

									}

									if (cash_bon.getText().equals("CASHBACK")) {
										try {
											Connection myConn = null;

											Statement myStmt = null;
											ResultSet myRs = null;

											String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
											String user = "multitem_test";
											String pass = "test123";
											myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
											myStmt = (Statement) myConn.createStatement();

											String sql2 = "SELECT Link_C FROM Getmore WHERE Link_C ='"
													+ link.getAttribute("href") + "' ";
											myRs = myStmt.executeQuery(sql2);

											if ((myRs.next())) {

												String up = "UPDATE Getmore SET CashBackEuro='" + cc + "',Bonus='" + bon
														+ "',InfoIfDiff='" + inf + "',Date='" + da + "' WHERE Link_C='"
														+ link.getAttribute("href") + "'";

												int my = myStmt.executeUpdate(up);

												if (my > 0) {
													timestamp2 = new Timestamp(System.currentTimeMillis());

													t2 = String.valueOf(timestamp2);

													stt = "[" + t2
															+ "] Getmore: Listing already exist for this day, so skipping";
													update(stt);
												}
											} else {

												String sql = "INSERT INTO Getmore (ShopName,CashBack,CashBackEuro,Bonus,BonusEuro,InfoIfDiff,Link,Link_C,Date) VALUES ('"
														+ tw + "','','" + cc + "','" + bon + "','','" + inf + "','','"
														+ link.getAttribute("href") + "','" + da + "')";
												int myRss = myStmt.executeUpdate(sql);

												if (myRss > 0) {
													System.out.println("value inserted to database");
													timestamp2 = new Timestamp(System.currentTimeMillis());

													t2 = String.valueOf(timestamp2);

													stt = "[" + t2 + "] Getmore:  Listing inserted successfully";
													update(stt);
												} else {
													// System.out.println("something is wrong");
													timestamp2 = new Timestamp(System.currentTimeMillis());

													t2 = String.valueOf(timestamp2);

													stt = "[" + t2 + "] Getmore:  Something went wrong";
													update(stt);
												}
											}

											myConn.close();
											myStmt.close();

											// myRs.close();

										} catch (Exception b) {
											b.printStackTrace();
										}
									} else {
										try {
											Connection myConn = null;

											Statement myStmt = null;
											ResultSet myRs = null;

											String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
											String user = "multitem_test";
											String pass = "test123";
											myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
											myStmt = (Statement) myConn.createStatement();
											String sql = "INSERT INTO Getmore (ShopName,CashBack,CashBackEuro,Bonus,BonusEuro,InfoIfDiff,Link,Date) VALUES ('"
													+ tw + "','','','" + bon + "','" + cc + "','" + inf + "','"
													+ link.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {

												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore:  Listing inserted successfully";
												update(stt);
											} else {
												timestamp2 = new Timestamp(System.currentTimeMillis());

												t2 = String.valueOf(timestamp2);

												stt = "[" + t2 + "] Getmore:  Something went wrong";
												update(stt);
											}

											myConn.close();
											myStmt.close();

											// myRs.close();

										} catch (Exception b) {
											b.printStackTrace();
										}
									}

								}
							}

							progressBar_3.setValue(i);
							progressBar_3.update(progressBar_3.getGraphics());
						} catch (Exception fh) {
							progressBar_3.setValue(i);
							progressBar_3.update(progressBar_3.getGraphics());
						}

					}
					progressBar_3.setValue(cash_l.size());
					progressBar_3.update(progressBar_3.getGraphics());
					String value1 = comboBox.getSelectedItem().toString();
					timestamp2 = new Timestamp(System.currentTimeMillis());

					t2 = String.valueOf(timestamp2);

					stt = "[" + t2 + "] Getmore:  Bot is waiting for " + value1 + " hours";
					update(stt);

					driver_g.close();

					driver_g.quit();
					// Thread.sleep(Integer.parseInt(value1)*3600000);

					Thread.sleep(5000);

					// get();

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static void shop() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					// int w=rowa;
					// System.out.println("row is: "+w);
					/*
					 * int w=1; row=sheet.getRow(w); if(row == null) { row = sheet.createRow(w); }
					 * cell = row.getCell(0); if(cell == null) {
					 * 
					 * } else{
					 */

					// w = sheet.getLastRowNum()+10;
					// JOptionPane.showMessageDialog(null,"All the rows have
					// been completed");
					Random r = new Random();
					int low = 1000;
					int high = 5000;

					int waits = r.nextInt(high - low) + low;

					// Thread.sleep(waits);

					// }else{

					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					if (System.getProperty("os.name").contains("Windows")) {
						System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

					} else {
						System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
					}
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					ChromeOptions options = new ChromeOptions();
					// options.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\covina");
					// options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)
					// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
					options.addArguments("--disable-blink-features=AutomationControlled");
					/* connecting to existing chrome session */
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options.setExperimentalOption("useAutomationExtension", false);
					// options.setExperimentalOption("debuggerAddress","localhost:3150");
					options.addExtensions(new File(path + "/chromedriver/captcha.crx"));
					// options.addExtensions(new
					// File(path+"/chromedriver/Proxy-Auto-Auth_v2.0.crx"));

					options.setCapability("requireWindowFocus", true);
					// options.addArguments("load-extension="+path+"/chromedriver/cap");
					options.addArguments("start-maximized");

					options.addArguments("user-data-dir=" + path + "/shop");
					Thread.sleep(2000);
					WebDriver driver_s = new ChromeDriver(options);

					WebDriverWait wait1 = new WebDriverWait(driver_s, 40);

					WebDriverWait wait2 = new WebDriverWait(driver_s, 20);
					WebDriverWait waitsS = new WebDriverWait(driver_s, 5);
					// driver_s.get("https://www.getmore.de/shops/partner/");

					DateTime dt = new DateTime();
					int hours = dt.getHourOfDay(); // gets hour of day

					int min = dt.getMinuteOfHour();

					int seconds = dt.getSecondOfMinute();

					int YEAR = dt.getYear();

					int month = dt.getMonthOfYear();

					int day = dt.getDayOfMonth();

					JavascriptExecutor js = (JavascriptExecutor) driver_s;

					Actions m = new Actions(driver_s);
					driver_s.get("chrome-extension://hapgiopokcmcnjmakciaeaocceodcjdn/options/main.html");

					String api = txtcefeabcfdfd.getText();

					Thread.sleep(4000);
					js.executeScript("document.querySelector('#apiKey').value='" + api + "';");

					Thread.sleep(1000);

					Boolean isChecked = driver_s.findElement(By.xpath("//*[@id='Auto']")).isSelected();

					if (isChecked == true) {
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Auto']"))).click();
					} else {
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Auto']"))).click();
					}
					// driver2.findElement(By.xpath("//*[@id='Auto']")).click();
					Thread.sleep(1000);

					Boolean isChecked2 = driver_s.findElement(By.xpath("(//select//option)[1]")).isSelected();
					;

					if (isChecked2 == true) {

					} else {
						wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select//option)[1]"))).click();
					}

					Thread.sleep(1000);

					Boolean isChecked3 = driver_s.findElement(By.xpath("//*[@id='AutoClick']")).isSelected();
					;

					if (isChecked3 == true) {

					} else {
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='AutoClick']"))).click();
					}

					Boolean isChecked4 = driver_s.findElement(By.xpath("//*[@id='isEnabled']")).isSelected();

					if (isChecked4 == true) {

					} else {

						js.executeScript("document.querySelector('#isEnabled').click();");

						Thread.sleep(1000);
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='AutoClick']"))).click();

						// driver2.findElement(By.xpath("//*[@id='isEnabled']")).click();

						// js3.executeScript("document.querySelector('#isEnabled').click();");
					}
					try {
						ar.clear();
					} catch (Exception hf) {

					}

					ar.add("https://www.shoop.de/kategorie/1-fashion");

					ar.add("https://www.shoop.de/kategorie/6-essen-trinken");
					ar.add("https://www.shoop.de/kategorie/12-haus-technik");
					ar.add("https://www.shoop.de/kategorie/20-internet-mobilfunk");
					ar.add("https://www.shoop.de/kategorie/25-reise");
					ar.add("https://www.shoop.de/kategorie/34-gesundheit-beauty");
					ar.add("https://www.shoop.de/kategorie/39-hobby-outdoor");

					ar.add("https://www.shoop.de/kategorie/47-baby-kind-spielzeug");
					ar.add("https://www.shoop.de/kategorie/51-geschenke");
					ar.add("https://www.shoop.de/kategorie/57-finanzen-vertraege");
					ar.add("https://www.shoop.de/kategorie/63-marktplaetze-versandhaeuser");

					progressBar_4.setMaximum(ar.size());
					progressBar_4.update(progressBar_4.getGraphics());
					for (int j = 0; j < ar.size(); j++) {
						try {
							driver_s.get(ar.get(j));
							for (int i = 0; i < 300; i++) {
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
								}
								// To check page ready state.
								if (js.executeScript("return document.readyState").toString().equals("complete")) {
									System.out.println("page loaded ");
									break;
								}
							}
							/*
							 * Boolean capa = driver_s.findElements(By.xpath("//iframe[@onload]")).size() >
							 * 0;
							 * 
							 * 
							 * if(capa== true) {
							 * if(driver_s.findElement(By.xpath("//iframe[@onload]")).isDisplayed()) {
							 * wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(
							 * "//iframe[@onload]")));
							 * 
							 * Thread.sleep(10000); driver_i.get(ar3.get(j)); }else{
							 * 
							 * } }
							 */

							//

							for (int h = 0; h < 10; h++) {

								List<WebElement> number = driver_s.findElements(By.xpath("//merchant-item"));

								System.out.println("number of listings: " + number.size());

								// m.moveToElement(number.get(number.size()-1)).build().perform();
								wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
										By.xpath("//div[@class='merchants-container card-list']//h2")));
								String tot = driver_s
										.findElement(By.xpath("//div[@class='merchants-container card-list']//h2"))
										.getText();

								tot = tot.replaceAll("\\D+", "");

								System.out.println("current listing num is: " + tot);
								if (number.size() != Integer.parseInt(tot)) {
									try {
										wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
												By.xpath("(//shoop-button)[2]/button")));
										WebElement element1 = wait1.until(ExpectedConditions
												.elementToBeClickable(By.xpath("(//shoop-button)[2]/button")));

										element1.click();

										Thread.sleep(3000);
									} catch (Exception fh) {

									}
									h = 0;
								} else {
									break;
								}

							}
							List<WebElement> mer_l = driver_s.findElements(By.xpath("//merchant-item"));

							System.out.println("total listing found: " + mer_l.size());
							String da = String.valueOf(day).concat("/" + String.valueOf(month))
									.concat("/" + String.valueOf(YEAR));

							for (int f = 1; f <= mer_l.size(); f++) {
								WebElement tit = driver_s
										.findElement(By.xpath("(//merchant-item)[" + f + "]//a[@class='link big']"));

								String ter = tit.getText();

								ter = ter.replaceAll("'", "''");

								ter = ter.replaceAll("\\s+", "");

								try {

									ter = ter.replaceAll(".de", "");
								} catch (Exception fhjh) {

								}
								try {
									ter = ter.replaceAll(".com", "");
								} catch (Exception fhj) {

								}

								WebElement li = driver_s
										.findElement(By.xpath("(//merchant-item)[" + f + "]//a[@class='link big']"));

								li.getAttribute("href");

								WebElement cas = driver_s.findElement(
										By.xpath("(//merchant-item)[" + f + "]//div[@data-e2e-name='cashbackTeaser']"));

								String cas_s = cas.getText();

								cas_s = cas_s.replaceAll("Cashback", "");

								String inf = "";

								if (cas_s.contains("bis zu")) {
									cas_s = cas_s.replaceAll("bis zu", "");
									inf = "yes";
								}

								try {
									cas_s = cas_s.replaceAll(",", ".");
								} catch (Exception fh) {

								}

								if (cas_s.contains("%")) {
									try {
										cas_s = cas_s.replaceAll("%", "");
									} catch (Exception fh) {

									}
									try {
										cas_s = cas_s.replaceAll("Prämie", "");
									} catch (Exception fh) {

									}

									try {
										cas_s = cas_s.replaceAll(".00", "");

									} catch (Exception ddg) {

									}

									try {
										String[] ca = cas_s.split(".");

										String sec = ca[1];

										String fir = ca[0];

										if (sec.contains("0")) {
											sec = sec.replaceAll("0", "");
										}

										cas_s = fir.concat(sec);

									} catch (Exception ddg) {

									}
									try {
										Connection myConn = null;

										Statement myStmt = null;
										ResultSet myRsss = null;

										String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
										String user = "multitem_test";
										String pass = "test123";
										myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
										myStmt = (Statement) myConn.createStatement();

										String sql2 = "SELECT ShopName,Link FROM Shopde WHERE Shopname = '" + ter
												+ "' and Link_C ='" + li.getAttribute("href") + "'";
										myRsss = myStmt.executeQuery(sql2);

										if ((myRsss.next())) {
											String sql = "UPDATE Shopde SET ShopName='" + ter + "',CashBack='" + cas_s
													+ "',InfoIfDiff='" + inf + "',Link_C='" + li.getAttribute("href")
													+ "',Date='" + da + "' WHERE ShopName='" + ter + "' ";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2
														+ "] Shoop: Listing already exist so updated the db";
												update(stt);
											}
										} else {

											String sql = "INSERT INTO Shopde (ShopName,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Link_C,Date) VALUES ('"
													+ ter + "','" + cas_s + "','','','" + inf
													+ "','https://www.shoop.de/invite/Bvjjdq2nyj/','"
													+ li.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Shoop: Listing inserted successfully";
												update(stt);
											} else {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Shoop: Something went wrong";
												update(stt);
											}
										}

										myConn.close();
										myStmt.close();

										// myRs.close();

									} catch (Exception b) {
										b.printStackTrace();
									}
								} else {
									try {
										cas_s = cas_s.replaceAll("€", "");
									} catch (Exception fh) {

									}
									try {
										cas_s = cas_s.replaceAll("Prämie", "");
									} catch (Exception fh) {

									}
									try {
										cas_s = cas_s.replaceAll(".00", "");

									} catch (Exception ddg) {

									}

									try {
										String[] ca = cas_s.split(".");

										String sec = ca[1];

										String fir = ca[0];

										if (sec.contains("0")) {
											sec = sec.replaceAll("0", "");
										}

										cas_s = fir.concat(sec);

									} catch (Exception ddg) {

									}
									try {
										Connection myConn = null;

										Statement myStmt = null;
										ResultSet myRsss = null;

										String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
										String user = "multitem_test";
										String pass = "test123";
										myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
										myStmt = (Statement) myConn.createStatement();

										String sql2 = "SELECT ShopName,Link_C FROM Shopde WHERE Shopname = '" + ter
												+ "' and Link_C ='" + li.getAttribute("href") + "' ";
										myRsss = myStmt.executeQuery(sql2);

										if ((myRsss.next())) {
											String sql = "UPDATE Shopde SET ShopName='" + ter + "',CashBackEuro='"
													+ cas_s + "',InfoIfDiff='" + inf + "',Link_C='"
													+ li.getAttribute("href") + "',Date='" + da + "' WHERE ShopName='"
													+ ter + "' ";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2
														+ "] Shoop: Listing already exist for this day, so skipping";
												update(stt);
											}
										} else {

											String sql = "INSERT INTO Shopde (ShopName,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Link_C,Date) VALUES ('"
													+ ter + "','','" + cas_s + "','','" + inf
													+ "','https://www.shoop.de/invite/Bvjjdq2nyj/','"
													+ li.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Shoop: Listing inserted successfully";
												update(stt);
											} else {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Shoop: Something went wrong";
												update(stt);
											}
										}

										myConn.close();
										myStmt.close();

										// myRs.close();

									} catch (Exception b) {
										b.printStackTrace();
									}
								}

							}

							progressBar_4.setValue(j);
							progressBar_4.update(progressBar_4.getGraphics());
						} catch (Exception frh) {
							progressBar_4.setValue(j);
							progressBar_4.update(progressBar_4.getGraphics());
						}

					}

					progressBar_4.setValue(ar.size());
					progressBar_4.update(progressBar_4.getGraphics());
					String da = String.valueOf(day).concat("/" + String.valueOf(month))
							.concat("/" + String.valueOf(YEAR));
					try {
						Connection myConn = null;

						Statement myStmt = null;
						ResultSet myRsss = null;

						String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
						String user = "multitem_test";
						String pass = "test123";
						myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
						myStmt = (Statement) myConn.createStatement();

						String sql2 = "SELECT Link_C FROM Shopde ";
						myRsss = myStmt.executeQuery(sql2);

						while (myRsss.next()) {
							String link_s = myRsss.getString("Link_C");

							li.add(link_s);

						}

						myConn.close();
						myStmt.close();

						// myRs.close();

					} catch (Exception b) {
						b.printStackTrace();
					}
					progressBar_4.setMaximum(li.size());
					progressBar_4.update(progressBar_4.getGraphics());
					for (int i = 0; i < li.size(); i++) {
						driver_s.get(li.get(i));
						for (int u = 0; u < 300; u++) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
							}
							// To check page ready state.
							if (js.executeScript("return document.readyState").toString().equals("complete")) {
								System.out.println("page loaded ");
								break;
							}
						}
						try {
							waitsS.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
									.xpath("//div[@class='voucher-count text-highlight big ng-star-inserted']/span")));
							String vou = driver_s
									.findElement(((By.xpath(
											"//div[@class='voucher-count text-highlight big ng-star-inserted']/span"))))
									.getText();

							vou = vou.replaceAll("\\D+", "");
							try {
								Connection myConn = null;

								Statement myStmt = null;
								ResultSet myRsss = null;

								String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
								String user = "multitem_test";
								String pass = "test123";
								myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
								myStmt = (Statement) myConn.createStatement();

								String sql2 = "UPDATE Shopde SET Bonus='" + vou + "'  WHERE Link_C='" + li.get(i)
										+ "' AND Date='" + da + "'";
								int upa = myStmt.executeUpdate(sql2);

								if (upa > 0) {
									String value1 = comboBox.getSelectedItem().toString();
									Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

									String t2 = String.valueOf(timestamp2);

									String stt = "[" + t2 + "] Shoop:  Bonus inserted!";
									update(stt);
									progressBar_4.setValue(i);
									progressBar_4.update(progressBar_4.getGraphics());
								}

								myConn.close();
								myStmt.close();

								// myRs.close();

							} catch (Exception b) {
								b.printStackTrace();
							}
						} catch (Exception fhj) {

						}

					}
					progressBar_4.setValue(li.size());
					progressBar_4.update(progressBar_4.getGraphics());

					try {
						li.clear();
					} catch (Exception fh) {

					}
					String value1 = comboBox.getSelectedItem().toString();
					Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

					String t2 = String.valueOf(timestamp2);

					String stt = "[" + t2 + "] Shoop:  Bot is waiting for " + value1 + " hours";
					update(stt);
					driver_s.close();

					driver_s.quit();
					// Thread.sleep(Integer.parseInt(value1)*3600000);

					Thread.sleep(5000);

					// shop();

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static void ig() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					// int w=rowa;
					// System.out.println("row is: "+w);
					/*
					 * int w=1; row=sheet.getRow(w); if(row == null) { row = sheet.createRow(w); }
					 * cell = row.getCell(0); if(cell == null) {
					 * 
					 * } else{
					 */

					// w = sheet.getLastRowNum()+10;
					// JOptionPane.showMessageDialog(null,"All the rows have
					// been completed");
					Random r = new Random();
					int low = 1000;
					int high = 5000;

					int waits = r.nextInt(high - low) + low;

					// Thread.sleep(waits);

					// }else{

					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					if (System.getProperty("os.name").contains("Windows")) {
						System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

					} else {
						System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
					}
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					ChromeOptions options = new ChromeOptions();
					// options.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\covina");
					// options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)
					// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
					options.addArguments("--disable-blink-features=AutomationControlled");
					/* connecting to existing chrome session */
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options.setExperimentalOption("useAutomationExtension", false);
					// options.setExperimentalOption("debuggerAddress","localhost:3150");
					options.addExtensions(new File(path + "/chromedriver/captcha.crx"));
					// options.addExtensions(new
					// File(path+"/chromedriver/Proxy-Auto-Auth_v2.0.crx"));
					// options.addArguments("load-extension="+path+"/chromedriver/cap");
					options.addArguments("start-maximized");
					options.setCapability("requireWindowFocus", true);
					options.addArguments("user-data-dir=" + path + "/igraal");
					// options.addArguments("window-size=1366,768");
					// options.addArguments("--lang=en-US");
					Thread.sleep(2000);
					WebDriver driver_i = new ChromeDriver(options);

					WebDriverWait wait1 = new WebDriverWait(driver_i, 40);
					WebDriverWait wait2 = new WebDriverWait(driver_i, 500);

					// driver_s.get("https://www.getmore.de/shops/partner/");

					DateTime dt = new DateTime();
					int hours = dt.getHourOfDay(); // gets hour of day

					int min = dt.getMinuteOfHour();

					int seconds = dt.getSecondOfMinute();

					int YEAR = dt.getYear();

					int month = dt.getMonthOfYear();

					int day = dt.getDayOfMonth();

					JavascriptExecutor js = (JavascriptExecutor) driver_i;

					Actions m = new Actions(driver_i);
					driver_i.get("chrome-extension://hapgiopokcmcnjmakciaeaocceodcjdn/options/main.html");

					String api = txtcefeabcfdfd.getText();

					Thread.sleep(4000);
					js.executeScript("document.querySelector('#apiKey').value='" + api + "';");

					Thread.sleep(1000);

					Boolean isChecked = driver_i.findElement(By.xpath("//*[@id='Auto']")).isSelected();

					if (isChecked == true) {
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Auto']"))).click();
					} else {
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Auto']"))).click();
					}
					// driver2.findElement(By.xpath("//*[@id='Auto']")).click();
					Thread.sleep(1000);

					Boolean isChecked2 = driver_i.findElement(By.xpath("(//select//option)[1]")).isSelected();
					;

					if (isChecked2 == true) {

					} else {
						wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//select//option)[1]"))).click();
					}

					Thread.sleep(1000);

					Boolean isChecked3 = driver_i.findElement(By.xpath("//*[@id='AutoClick']")).isSelected();
					;

					if (isChecked3 == true) {

					} else {
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='AutoClick']"))).click();
					}

					Boolean isChecked4 = driver_i.findElement(By.xpath("//*[@id='isEnabled']")).isSelected();

					if (isChecked4 == true) {

					} else {

						js.executeScript("document.querySelector('#isEnabled').click();");

						Thread.sleep(1000);
						// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='AutoClick']"))).click();

						// driver2.findElement(By.xpath("//*[@id='isEnabled']")).click();

						// js3.executeScript("document.querySelector('#isEnabled').click();");
					}

					try {
						ar3.clear();
					} catch (Exception hf) {

					}

					ar3.add("https://de.igraal.com/partnershops/#category=48");
					ar3.add("https://de.igraal.com/partnershops/#category=79");
					ar3.add("https://de.igraal.com/partnershops/#category=60");
					ar3.add("https://de.igraal.com/partnershops/#category=42");
					ar3.add("https://de.igraal.com/partnershops/#category=33");
					ar3.add("https://de.igraal.com/partnershops/#category=9127");
					ar3.add("https://de.igraal.com/partnershops/#category=23");
					ar3.add("https://de.igraal.com/partnershops/#category=30");
					ar3.add("https://de.igraal.com/partnershops/#category=9121");
					ar3.add("https://de.igraal.com/partnershops/#category=9133");
					ar3.add("https://de.igraal.com/partnershops/#category=13");
					ar3.add("https://de.igraal.com/partnershops/#category=29");
					ar3.add("https://de.igraal.com/partnershops/#category=3");
					ar3.add("https://de.igraal.com/partnershops/#category=9130");

					ar3.add("https://de.igraal.com/partnershops/#category=9118");
					progressBar_1.setMaximum(ar3.size());
					progressBar_1.update(progressBar_1.getGraphics());
					for (int j = 0; j < ar3.size(); j++) {
						try {
							driver_i.get(ar3.get(j));

							Thread.sleep(3000);

							for (int i = 0; i < 300; i++) {
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
								}
								// To check page ready state.
								if (js.executeScript("return document.readyState").toString().equals("complete")) {
									System.out.println("page loaded ");
									break;
								}
							}
							// iframe[@onload]

							Boolean capa = driver_i.findElements(By.xpath("//iframe[@onload]")).size() > 0;

							if (capa == true) {
								if (driver_i.findElement(By.xpath("//iframe[@onload]")).isDisplayed()) {
									wait2.until(ExpectedConditions
											.invisibilityOfElementLocated(By.xpath("//iframe[@onload]")));

									Thread.sleep(10000);
									driver_i.get(ar3.get(j));
								} else {

								}
							}

							//
							/*
							 * for(int h=0;h<10;h++) {
							 * 
							 * 
							 * 
							 * try{
							 * 
							 * WebElement element1 =
							 * wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
							 * "(//shoop-button)[2]/button")));
							 * 
							 * element1.click();
							 * 
							 * Thread.sleep(3000); h=0; }catch(Exception f) { break; }
							 * 
							 * 
							 * }
							 */
							List<WebElement> mer_l = driver_i
									.findElements(By.xpath("//tbody[@data-ig-allmerchant-block]/tr"));

							System.out.println("total listing found: " + mer_l.size());
							String da = String.valueOf(day).concat("/" + String.valueOf(month))
									.concat("/" + String.valueOf(YEAR));

							for (int f = 1; f <= mer_l.size(); f++) {
								WebElement tit = driver_i.findElement(
										By.xpath("(//tbody[@data-ig-allmerchant-block]/tr)[" + f + "]/td[1]/a"));

								tit.getText();

								String tt = tit.getText();

								tt = tt.replaceAll("'", "''");

								tt = tt.replaceAll("\\s+", "");

								try {

									tt = tt.replaceAll(".de", "");
								} catch (Exception fhjh) {

								}
								try {
									tt = tt.replaceAll(".com", "");
								} catch (Exception fhj) {

								}

								WebElement li = driver_i.findElement(
										By.xpath("(//tbody[@data-ig-allmerchant-block]/tr)[" + f + "]/td[1]/a"));

								li.getAttribute("href");

								String cas_ss = "";
								String up = "";
								try {
									try {
										up = driver_i.findElement(By.xpath("(//tbody[@data-ig-allmerchant-block]/tr)["
												+ f + "]/td[2]/span/span[@class='up_to_txt']")).getText();

									} catch (Exception fh) {

									}
									WebElement cas = driver_i
											.findElement(By.xpath("(//tbody[@data-ig-allmerchant-block]/tr)[" + f
													+ "]/td[2]/span/span[@class='cashback_rate']"));

									// cas_ss = cas.getText();
									cas_ss = up.concat(" " + cas.getText());
								} catch (Exception fg) {

								}
								String cp_s = "";
								String inf = "";
								if (cas_ss.contains("bis zu")) {
									cas_ss = cas_ss.replaceAll("bis zu", "");
									inf = "yes";
								}

								try {
									cas_ss = cas_ss.replaceAll(",", ".");
								} catch (Exception fh) {

								}

								if (cas_ss.contains("%")) {
									try {
										cas_ss = cas_ss.replaceAll("%", "");
									} catch (Exception fh) {

									}

									try {
										cas_ss = cas_ss.replaceAll(".00", "");

									} catch (Exception ddg) {

									}

									try {
										String[] ca = cas_ss.split(".");

										String sec = ca[1];

										String fir = ca[0];

										if (sec.contains("0")) {
											sec = sec.replaceAll("0", "");
										}

										cas_ss = fir.concat(sec);

									} catch (Exception ddg) {

									}

									try {
										WebElement cp = driver_i.findElement(By.xpath(
												"(//tbody[@data-ig-allmerchant-block]/tr)[" + f + "]/td[3]/span"));
										cp_s = cp.getText();
									} catch (Exception d) {

									}
									// cas_s = cas_s.replaceAll("Cashback", "");

									try {
										Connection myConn = null;

										Statement myStmt = null;
										ResultSet myRs = null;

										String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
										String user = "multitem_test";
										String pass = "test123";
										myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
										myStmt = (Statement) myConn.createStatement();

										String sql2 = "SELECT ShopName,Link_C FROM  igraal WHERE ShopName='" + tt
												+ "' and Link_C='" + li.getAttribute("href") + "'";
										myRs = myStmt.executeQuery(sql2);

										if ((myRs.next())) {

											String sql = "UPDATE igraal SET ShopName='" + tt + "',CashBack='" + cas_ss
													+ "',Bonus='" + cp_s + "',InfoIfDiff='" + inf + "',Date='" + da
													+ "' WHERE ShopName='" + tt + "' and Link_C='"
													+ li.getAttribute("href") + "' ";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {

												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2
														+ "] Igraal: Listing already exist so updated the db";
												update(stt);
											}
										}

										else {

											String sql = "INSERT INTO igraal (ShopName,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Link_C,Date) VALUES ('"
													+ tt + "','" + cas_ss + "','','" + cp_s + "','" + inf
													+ "','https://de.igraal.com/?werber=AG_60818c8e6e0de','"
													+ li.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Igraal: Listing inserted successfully";
												update(stt);
											} else {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Igraal: Something went wrong";
												update(stt);
											}
										}

										myConn.close();
										myStmt.close();

										// myRs.close();

									} catch (Exception b) {
										b.printStackTrace();
									}

								} else {

									try {
										cas_ss = cas_ss.replaceAll("€", "");
									} catch (Exception fh) {

									}
									try {
										WebElement cp = driver_i.findElement(By.xpath(
												"(//tbody[@data-ig-allmerchant-block]/tr)[" + f + "]/td[3]/span"));
										cp_s = cp.getText();
									} catch (Exception d) {

									}
									// cas_s = cas_s.replaceAll("Cashback", "");

									try {
										cas_ss = cas_ss.replaceAll(".00", "");

									} catch (Exception ddg) {

									}

									try {
										String[] ca = cas_ss.split(".");

										String sec = ca[1];

										String fir = ca[0];

										if (sec.contains("0")) {
											sec = sec.replaceAll("0", "");
										}

										cas_ss = fir.concat(sec);

									} catch (Exception ddg) {

									}

									try {
										Connection myConn = null;

										Statement myStmt = null;
										ResultSet myRs = null;

										String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
										String user = "multitem_test";
										String pass = "test123";
										myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
										myStmt = (Statement) myConn.createStatement();

										String sql2 = "SELECT ShopName,Link_C FROM  igraal WHERE ShopName='" + tt
												+ "' and Link_C='" + li.getAttribute("href") + "'";
										myRs = myStmt.executeQuery(sql2);

										if ((myRs.next())) {

											String sql = "UPDATE igraal SET ShopName='" + tt + "',CashBackEuro='"
													+ cas_ss + "',Bonus='" + cp_s + "',InfoIfDiff='" + inf
													+ "',Link_C='" + li.getAttribute("href") + "',Date='" + da
													+ "' WHERE ShopName='" + tt + "' ";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Igraal: Listing already so update";
												update(stt);
											}
										} else {

											String sql = "INSERT INTO igraal (ShopName,CashBack,CashBackEuro,Bonus,InfoIfDiff,Link,Link_C,Date) VALUES ('"
													+ tt + "','','" + cas_ss + "','" + cp_s + "','" + inf
													+ "','https://de.igraal.com/?werber=AG_60818c8e6e0de','"
													+ li.getAttribute("href") + "','" + da + "')";
											int myRss = myStmt.executeUpdate(sql);

											if (myRss > 0) {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Igraal: Listing inserted successfully";
												update(stt);
											} else {
												Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

												String t2 = String.valueOf(timestamp2);

												String stt = "[" + t2 + "] Igraal: Something went wrong";
												update(stt);
											}
										}

										myConn.close();
										myStmt.close();

										// myRs.close();

									} catch (Exception b) {
										b.printStackTrace();
									}

								}
							}
							progressBar_1.setValue(j);
							progressBar_1.update(progressBar_1.getGraphics());

						} catch (Exception fh) {
							progressBar_1.setValue(j);
							progressBar_1.update(progressBar_1.getGraphics());
						}

					}

					progressBar_1.setValue(ar3.size());
					progressBar_1.update(progressBar_1.getGraphics());

					String value1 = comboBox.getSelectedItem().toString();
					Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

					String t2 = String.valueOf(timestamp2);

					String stt = "[" + t2 + "] Igraal:  Bot is waiting for " + value1 + " hours";
					update(stt);
					driver_i.close();

					driver_i.quit();
					// Thread.sleep(Integer.parseInt(value1)*3600000);

					Thread.sleep(5000);

					// ig();

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static void getex() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					// int w=rowa;
					// System.out.println("row is: "+w);
					/*
					 * int w=1; row=sheet.getRow(w); if(row == null) { row = sheet.createRow(w); }
					 * cell = row.getCell(0); if(cell == null) {
					 * 
					 * } else{
					 */

					// w = sheet.getLastRowNum()+10;
					// JOptionPane.showMessageDialog(null,"All the rows have
					// been completed");
					Random r = new Random();
					int low = 1000;
					int high = 5000;

					int waits = r.nextInt(high - low) + low;

					// Thread.sleep(waits);

					// }else{

					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					if (System.getProperty("os.name").contains("Windows")) {
						System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

					} else {
						System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
					}
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					ChromeOptions options = new ChromeOptions();
					// options.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\covina");
					// options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)
					// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
					options.addArguments("--disable-blink-features=AutomationControlled");
					/* connecting to existing chrome session */
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options.setExperimentalOption("useAutomationExtension", false);
					// options.setExperimentalOption("debuggerAddress","localhost:3150");
					options.addExtensions(new File(path + "/chromedriver/captcha.crx"));
					// options.addExtensions(new
					// File(path+"/chromedriver/Proxy-Auto-Auth_v2.0.crx"));
					// options.addArguments("load-extension="+path+"/chromedriver/cap");
					options.addArguments("start-maximized");
					options.setCapability("requireWindowFocus", true);
					options.addArguments("user-data-dir=" + path + "/getex");
					// options.addArguments("window-size=1366,768");
					// options.addArguments("--lang=en-US");
					Thread.sleep(2000);
					WebDriver driver_g = new ChromeDriver(options);

					WebDriverWait wait1 = new WebDriverWait(driver_g, 10);

					Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

					String t2 = String.valueOf(timestamp2);

					String stt = "[" + t2 + "] Getmore:  Going to Getmore";
					update(stt);

					driver_g.get("https://www.getmore.de/shops/partner/");

					DateTime dt = new DateTime();
					int hours = dt.getHourOfDay(); // gets hour of day

					int min = dt.getMinuteOfHour();

					int seconds = dt.getSecondOfMinute();

					int YEAR = dt.getYear();

					int month = dt.getMonthOfYear();

					int day = dt.getDayOfMonth();

					JavascriptExecutor js = (JavascriptExecutor) driver_g;

					for (int i = 0; i < 300; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}
						// To check page ready state.
						if (js.executeScript("return document.readyState").toString().equals("complete")) {
							System.out.println("page loaded ");
							break;
						}
					}
					Actions m = new Actions(driver_g);

					String da = String.valueOf(day).concat("/" + String.valueOf(month))
							.concat("/" + String.valueOf(YEAR));
					try {
						Connection myConn = null;

						Statement myStmt = null;
						ResultSet myRsss = null;

						String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
						String user = "multitem_test";
						String pass = "test123";
						myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
						myStmt = (Statement) myConn.createStatement();

						String sql2 = "SELECT Link_C FROM Getmore ";
						myRsss = myStmt.executeQuery(sql2);

						while (myRsss.next()) {
							String link_s = myRsss.getString("Link_C");

							li_g.add(link_s);

						}

						myConn.close();
						myStmt.close();

						// myRs.close();

					} catch (Exception b) {
						b.printStackTrace();
					}
					progressBar_3.setMaximum(li_g.size());
					progressBar_3.update(progressBar_3.getGraphics());
					for (int i = 0; i < li_g.size(); i++) {
						driver_g.get(li_g.get(i));

						try {
							WebElement tit = wait1.until(ExpectedConditions
									.elementToBeClickable((By.xpath("//a[@class='recommend-product']"))));

							tit.click();

							wait1.until(ExpectedConditions
									.visibilityOfElementLocated(By.xpath("//input[@id='offer-recommend-link']")));

							WebElement lia = driver_g.findElement(By.xpath("//input[@id='offer-recommend-link']"));

							String lo = lia.getAttribute("value");

							try {
								Connection myConn = null;

								Statement myStmt = null;
								ResultSet myRsss = null;

								String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
								String user = "multitem_test";
								String pass = "test123";
								myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
								myStmt = (Statement) myConn.createStatement();

								String sql2 = "UPDATE Getmore SET Link='" + lo + "' WHERE Link_C='" + li_g.get(i) + "'";
								int myb = myStmt.executeUpdate(sql2);

								if (myb > 0) {
									timestamp2 = new Timestamp(System.currentTimeMillis());

									t2 = String.valueOf(timestamp2);

									stt = "[" + t2 + "] Getmore:  Link updated";
									update(stt);
								}

								myConn.close();
								myStmt.close();

								// myRs.close();

							} catch (Exception b) {
								b.printStackTrace();
							}
						} catch (Exception fh) {
							try {
								String lo = "https://bit.ly/30TPHmW";

								try {
									Connection myConn = null;

									Statement myStmt = null;
									ResultSet myRsss = null;

									String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
									String user = "multitem_test";
									String pass = "test123";
									myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
									myStmt = (Statement) myConn.createStatement();

									String sql2 = "UPDATE Getmore SET Link='" + lo + "' WHERE Link_C='" + li_g.get(i)
											+ "'";
									int myb = myStmt.executeUpdate(sql2);

									if (myb > 0) {
										timestamp2 = new Timestamp(System.currentTimeMillis());

										t2 = String.valueOf(timestamp2);

										stt = "[" + t2 + "] Getmore:  Link updated";
										update(stt);
									}

									myConn.close();
									myStmt.close();

									// myRs.close();

								} catch (Exception b) {
									b.printStackTrace();
								}
							} catch (Exception fhs) {

							}
						}
						Thread.sleep(2000);
						progressBar_3.setValue(i);
						progressBar_3.update(progressBar_3.getGraphics());

					}
					progressBar_3.setValue(li_g.size());
					progressBar_3.update(progressBar_3.getGraphics());

					li_g.clear();
					String value1 = comboBox.getSelectedItem().toString();
					timestamp2 = new Timestamp(System.currentTimeMillis());

					t2 = String.valueOf(timestamp2);

					stt = "[" + t2 + "] Getmore:  Link updating process is completed";
					update(stt);

					driver_g.close();

					driver_g.quit();
					Thread.sleep(5000);

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static void cashex() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					// int w=rowa;
					// System.out.println("row is: "+w);
					/*
					 * int w=1; row=sheet.getRow(w); if(row == null) { row = sheet.createRow(w); }
					 * cell = row.getCell(0); if(cell == null) {
					 * 
					 * } else{
					 */

					// w = sheet.getLastRowNum()+10;
					// JOptionPane.showMessageDialog(null,"All the rows have
					// been completed");
					Random r = new Random();
					int low = 1000;
					int high = 5000;

					int waits = r.nextInt(high - low) + low;

					// Thread.sleep(waits);

					// }else{

					String path = new File(".").getCanonicalPath();
					System.out.println("Application path is: " + path);
					if (System.getProperty("os.name").contains("Windows")) {
						System.setProperty("webdriver.chrome.driver", "" + path + "\\chromedriver\\chromedriver.exe");

					} else {
						System.setProperty("webdriver.chrome.driver", "" + path + "/chromedriver/chromedriver");
					}
					// System.setProperty("webdriver.chrome.driver",
					// "C:\\chromedriver\\chromedriver.exe");

					// String proxy = cell10.toString();

					try {
						String proxy_s1 = txtProxypacketstreamio.getText();
						String[] pp = proxy_s1.split(":");
						ip = pp[0].trim();

						port = pp[1].trim();

						user = pp[2].trim();

						passw = pp[3].trim();
					} catch (Exception ty) {

					}

					ChromeOptions options = new ChromeOptions();
					// options.addArguments("user-data-dir="+fw.getDefaultDirectory()+"\\covina");
					// options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)
					// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/81.0.4044.122 Safari/537.36");
					options.addArguments("--disable-blink-features=AutomationControlled");
					/* connecting to existing chrome session */
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					options.setExperimentalOption("useAutomationExtension", false);
					// options.setExperimentalOption("debuggerAddress","localhost:3150");
					options.addExtensions(new File(path + "/chromedriver/captcha.crx"));
					// options.addExtensions(new
					// File(path+"/chromedriver/Proxy-Auto-Auth_v2.0.crx"));
					// options.addArguments("load-extension="+path+"/chromedriver/cap");
					options.addArguments("start-maximized");

					options.addArguments("user-data-dir=" + path + "/cashex");
					// options.addArguments("window-size=1366,768");
					// options.addArguments("--lang=en-US");
					Thread.sleep(2000);
					WebDriver driver = new ChromeDriver(options);

					WebDriverWait wait1 = new WebDriverWait(driver, 40);

					Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

					String t2 = String.valueOf(timestamp2);

					String stt = "[" + t2 + "] Cashbackdeals:  Going to cashbackdeals";
					update(stt);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					driver.get("https://www.cashbackdeals.de/user/cashboost.php");

					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='open-link']")));

					// driver.findElement(By.xpath("//a[@id='open-link']")).click();
					js.executeScript("document.querySelector('#open-link').click();");
					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='t']")));

					wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='store-link']")));
					DateTime dt = new DateTime();
					int hours = dt.getHourOfDay(); // gets hour of day

					int min = dt.getMinuteOfHour();

					int seconds = dt.getSecondOfMinute();

					int YEAR = dt.getYear();

					int month = dt.getMonthOfYear();

					int day = dt.getDayOfMonth();

					for (int i = 0; i < 300; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
						}
						// To check page ready state.
						if (js.executeScript("return document.readyState").toString().equals("complete")) {
							System.out.println("page loaded ");
							break;
						}
					}

					String da = String.valueOf(day).concat("/" + String.valueOf(month))
							.concat("/" + String.valueOf(YEAR));
					try {
						Connection myConn = null;

						Statement myStmt = null;
						ResultSet myRsss = null;

						String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
						String user = "multitem_test";
						String pass = "test123";
						myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
						myStmt = (Statement) myConn.createStatement();

						String sql2 = "SELECT ShopNameEx FROM Cashbackdeals ";
						myRsss = myStmt.executeQuery(sql2);

						while (myRsss.next()) {
							String link_s = myRsss.getString("ShopNameEx");

							li_c.add(link_s);

						}

						myConn.close();
						myStmt.close();

						// myRs.close();

					} catch (Exception b) {
						b.printStackTrace();
					}

					progressBar_2.setMaximum(li_c.size());
					progressBar_2.update(progressBar_2.getGraphics());

					for (int i = 0; i <= li_c.size(); i++) {
						try {
							WebElement sh = driver.findElement(By.xpath("//input[@id='t']"));

							sh.clear();
							Thread.sleep(1000);
							sh.sendKeys(li_c.get(i));

							Thread.sleep(4000);

							driver.findElement(By.xpath("//div[@id='searchList']/ul/li[1]/a[1]")).click();
							Thread.sleep(2000);

							wait1.until(ExpectedConditions
									.visibilityOfElementLocated(By.xpath("//input[@id='store-link']")));

							WebElement lfh = driver.findElement(By.xpath("//div[@id='searchList']/ul/li[1]/a[1]"));

							String lisa = lfh.getAttribute("onclick");

							String fina = extractURL(lisa);

							System.out.println(fina);

							try {
								Connection myConn = null;

								Statement myStmt = null;
								ResultSet myRsss = null;

								String dburl = "jdbc:mysql://gator4115.hostgator.com:3306/multitem_bot";
								String user = "multitem_test";
								String pass = "test123";
								myConn = (Connection) DriverManager.getConnection(dburl, user, pass);
								myStmt = (Statement) myConn.createStatement();

								String sql2 = "UPDATE Cashbackdeals SET Link='" + fina + "' WHERE ShopNameEx='"
										+ li_c.get(i) + "'";
								int myb = myStmt.executeUpdate(sql2);

								if (myb > 0) {
									timestamp2 = new Timestamp(System.currentTimeMillis());

									t2 = String.valueOf(timestamp2);

									stt = "[" + t2 + "] Cashbackdeals:  Link updated";
									update(stt);
								}

								myConn.close();
								myStmt.close();

								// myRs.close();

							} catch (Exception b) {
								b.printStackTrace();
							}
						} catch (Exception gh) {

						}
						progressBar_2.setValue(i);
						;
						progressBar_2.update(progressBar_2.getGraphics());
					}

					String value1 = comboBox.getSelectedItem().toString();
					timestamp2 = new Timestamp(System.currentTimeMillis());

					t2 = String.valueOf(timestamp2);

					stt = "[" + t2 + "] Cashbackdeals:  Link updating process is finished";
					update(stt);

					driver.close();

					driver.quit();
					Thread.sleep(5000);

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static void sr() {
		try {
			Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"taskkill.exe /F /IM chromedriver.exe /T");

			Thread.sleep(500);
		} catch (Exception hg) {

		}
		System.out.println(String.valueOf(getm));
		if (getm == true) {

			get();

			try {
				Thread.sleep(1000);

			} catch (Exception dg) {

			}

		}
		System.out.println(String.valueOf(cback));
		if (cback == true) {
			cash();

			try {
				Thread.sleep(1000);

			} catch (Exception dg) {

			}
		}
		System.out.println(String.valueOf(shoop));
		if (shoop == true) {
			shop();

			try {
				Thread.sleep(1000);

			} catch (Exception dg) {

			}
		}

		System.out.println(String.valueOf(igr));
		if (igr == true) {
			ig();

			try {
				Thread.sleep(1000);

			} catch (Exception dg) {

			}
		}

		if (Getx == true) {
			getex();
			try {
				Thread.sleep(1000);

			} catch (Exception dg) {

			}

		}

		if (cx == true) {
			cashex();
			try {
				Thread.sleep(1000);

			} catch (Exception dg) {

			}

		}
	}

	public static void rep_t() {
		SwingWorker<Void, Void> email_c = new SwingWorker<Void, Void>() {

			private int s;
			private int i;
			private String db_user;
			private String db_pass;
			private String db_users;
			private String db_passs;
			private int max;

			@Override
			protected Void doInBackground() throws Exception {

				// System.out.println("row called : "+rowa+ " and browser :"+a);
				try {

					for (int i = 0; i < 10; i++) {

						sr();

						String value1 = comboBox.getSelectedItem().toString();
						Thread.sleep(Integer.parseInt(value1) * 3600000);
						i = 0;
					}

				} catch (Exception y) {
					y.printStackTrace();

					StringWriter sw = new StringWriter();
					y.printStackTrace(new PrintWriter(sw));
					String exceptionAsString = sw.toString();
					System.out.println(exceptionAsString);
					JOptionPane.showMessageDialog(null, "" + exceptionAsString + "", "ERROR!",
							JOptionPane.ERROR_MESSAGE);

					// driver2.close();
					// driver2.quit();
					// Thread.sleep(10000);
					// rebeet();
				}

				return null;
			}

		};
		email_c.execute();

	}

	public static String extractURL(String str) {
		String res = "";

		// Creating an empty ArrayList
		List<String> list = new ArrayList<>();

		// Regular Expression to extract
		// URL from the string
		String regex = "\\b((?:https?|ftp|file):" + "//[-a-zA-Z0-9+&@#/%?=" + "~_|!:, .;]*[-a-zA-Z0-9+" + "&@#/%=~_|])";

		// Compile the Regular Expression
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// Find the match between string
		// and the regular expression
		Matcher m = p.matcher(str);

		// Find the next subsequence of
		// the input subsequence that
		// find the pattern
		while (m.find()) {

			// Find the substring from the
			// first index of match result
			// to the last index of match
			// result and add in the list
			list.add(str.substring(m.start(0), m.end(0)));
		}

		// IF there no URL present
		if (list.size() == 0) {
			System.out.println("-1");

		}

		// Print all the URLs stored
		for (String url : list) {
			System.out.println(url);
			res = url;
		}
		return res;
	}

	private static void update(String st) {

		try {

			text.append("\n" + st);

			text.update(text.getGraphics());

			text.repaint();

		} catch (Exception df) {

		}

	}

	public static void exist() {
		ex = true;

	}

	public static void allarr(ArrayList<String> ar2) {

		for (int y = 0; y < ar2.size(); y++) {
			ar.add(ar2.get(y));
			// System.out.println(ar2.get(y));
		}
	}

	/*
	 * public static void pdf_s(){ SwingWorker<Void,Void> email = new
	 * SwingWorker<Void,Void>() {
	 * 
	 * 
	 * 
	 * @Override protected Void doInBackground() throws Exception {
	 * 
	 * 
	 * Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
	 * 
	 * String t2 = String.valueOf(timestamp2);
	 * 
	 * String st = "["+t2+"] Saving will start in 10 seconds ";
	 * 
	 * 
	 * 
	 * update(st); JFileChooser fr = new JFileChooser(); FileSystemView fw =
	 * fr.getFileSystemView();
	 * 
	 * File direc = fw.getDefaultDirectory();
	 * System.out.println(fw.getDefaultDirectory());
	 * 
	 * 
	 * 
	 * // if the file didnt accept the renaming operation
	 * System.out.println("file is opened"); try { String processName = "fddex.pdf";
	 * Runtime rt = Runtime.getRuntime(); // For Windows OS... if
	 * (System.getProperty("os.name").toLowerCase().contains("windows")) {
	 * rt.exec("taskkill /T /F /IM " + processName);
	 * //rt.exec("taskkill /T /F /PID " + Long.parseLong(processName)); // Supply
	 * the PID value as string //rt.exec("taskkill /F /FI \"WINDOWTITLE eq " +
	 * processName + "\" /T"); // Supply the window title bar text. // If you want
	 * to kill only a single instance of the // named process then get its PID value
	 * and use: // "taskkill /T /F /PID PID_Value" OR you can provide // the window
	 * title and use: // "taskkill /F /FI \"WINDOWTITLE eq " + processName + "\" /T"
	 * } // For OSX And Linux OS's... else { rt.exec("sudo killall -9 '" +
	 * processName + "'"); //rt.exec("kill -9 " + Long.parseLong(processName)); //
	 * Supply the PID value as string // If you want to kill only a single instance
	 * of the // named process then get its PID value and use: //
	 * "kill -9 PID_Value" } rt.freeMemory();
	 * 
	 * } catch (IOException | SecurityException | IllegalArgumentException ex) {
	 * ex.printStackTrace(); }
	 * 
	 * 
	 * 
	 * Document document = new Document(); PdfWriter.getInstance(document, new
	 * FileOutputStream(fw.getDefaultDirectory()+"\\fddex.pdf")); try {
	 * 
	 * //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "(//span[@class='pdfemb-page-count'])[1]")));
	 * 
	 * 
	 * String page_s =
	 * driver2.findElement(By.xpath("(//span[@class='pdfemb-page-count'])[1]")).
	 * getText(); int page = Integer.parseInt(page_s); progressBar.setMaximum(page);
	 * progressBar.update(progressBar.getGraphics());
	 * 
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor)driver2;
	 * 
	 * File theDir = new File(fw.getDefaultDirectory()+"\\fdd");
	 * 
	 * // if the directory does not exist, create it if (!theDir.exists()) {
	 * System.out.println("creating directory: " + theDir.getName()); boolean result
	 * = false;
	 * 
	 * try{ theDir.mkdir(); result = true; } catch(SecurityException se){ //handle
	 * it } if(result) { System.out.println("DIR created");
	 * 
	 * 
	 * } }
	 * 
	 * theDir = new File(fw.getDefaultDirectory()+"\\cropped");
	 * 
	 * // if the directory does not exist, create it if (!theDir.exists()) {
	 * System.out.println("creating directory: " + theDir.getName()); boolean result
	 * = false;
	 * 
	 * try{ theDir.mkdir(); result = true; } catch(SecurityException se){ //handle
	 * it } if(result) { System.out.println("DIR created");
	 * 
	 * 
	 * } } /* try{ Screenshot fpScreenshot = new
	 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
	 * takeScreenshot(driver2,
	 * driver2.findElement(By.xpath("/html/body/div[4]/div/div/div[1]")));
	 * ImageIO.write(fpScreenshot.getImage(),"PNG",new
	 * File(fw.getDefaultDirectory()+"///FullPageScreenshot.png")); }catch(Exception
	 * fh) { fh.printStackTrace(); }
	 */
	/*
	 * js.executeScript(" document.querySelector('body > header').remove();");
	 * 
	 * 
	 * js.executeScript(" document.querySelector('#wrapper-38').remove();");
	 * 
	 * 
	 * js.executeScript(" document.querySelector('#wrapper-41').remove();");
	 * 
	 * 
	 * 
	 * 
	 * js.executeScript("document.querySelector('#wrapper-42').remove();");
	 * 
	 * 
	 * js.executeScript("document.querySelector('body > footer').remove();");
	 * 
	 * 
	 * 
	 * Thread.sleep(10000);
	 * 
	 * 
	 * for(int i=1;i<=page;i++) {
	 * 
	 * 
	 * /* BufferedImage images = Shutterbug.shootPage(driver2,
	 * ScrollStrategy.WHOLE_PAGE).getImage(); ByteArrayOutputStream outputStream =
	 * new ByteArrayOutputStream(); ImageIO.write(images, "png", outputStream);
	 */

	// Screenshot screenshot = new
	// AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver2,driver2.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div["+i+"]//canvas")));
	// ImageIO.write(screenshot.getImage(),"PNG",new
	// File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".jpg"));

	/*
	 * 
	 * try{ Screenshot fpScreenshot = new
	 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).
	 * takeScreenshot(driver2); ImageIO.write(fpScreenshot.getImage(),"PNG",new
	 * File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png")); }catch(Exception fh) {
	 * fh.printStackTrace(); }
	 * 
	 * /* Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 * Rectangle screenRectangle = new Rectangle(screenSize); Robot robot = new
	 * Robot(); BufferedImage imageSS = robot.createScreenCapture(screenRectangle);
	 * ImageIO.write(imageSS, "png", new
	 * File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png"));
	 * 
	 */
	// File imgCap2 =
	// ((TakesScreenshot)driver2.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div["+i+"]//div"))).getScreenshotAs(OutputType.FILE);

	// FileUtils.copyFile(imgCap2, new
	// File(fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png"));

	/*
	 * document.open();
	 * 
	 * 
	 * 
	 * re (fw.getDefaultDirectory()+"\\fdd\\sc"+i+".png");
	 * 
	 * 
	 * 
	 * 
	 * Image image =
	 * Image.getInstance(fw.getDefaultDirectory()+"\\cropped\\Square.png");
	 * 
	 * //Image image = new Image(ImageDataFactory.create("")); //
	 * image.scaleToFit(document.getPageSize());
	 * 
	 * 
	 * image.scaleAbsolute(PageSize.A4); image.setAbsolutePosition(0, 0);
	 * 
	 * document.add(image); document.newPage();
	 * 
	 * 
	 * 
	 * driver2.findElement(By.xpath(
	 * "/html/body/div[2]/div/div/div/div/div/div/div/article/div[1]/div/div[3]/button[2]"
	 * )).click();
	 * 
	 * Thread.sleep(2000);
	 * 
	 * js.executeScript("window.scrollTo(0, 0);");
	 * 
	 * 
	 * Random r = new Random(); int low = 3000; int high = 5000;
	 * 
	 * int waitA = r.nextInt(high-low) + low;
	 * 
	 * Thread.sleep(waitA);
	 * 
	 * 
	 * timestamp2 = new Timestamp(System.currentTimeMillis());
	 * 
	 * t2 = String.valueOf(timestamp2);
	 * 
	 * st ="["+t2+"] Page "+(i)+" has been saved"; update(st);
	 * progressBar.setValue(i); progressBar.update(progressBar.getGraphics()); }
	 * 
	 * Timestamp timestamp3 = new Timestamp(System.currentTimeMillis());
	 * 
	 * String t3 = String.valueOf(timestamp3);
	 * 
	 * String st1 ="["+
	 * t3+"] All the pages have been saved , check the output in computer's Documnent directly named fddex.pdf"
	 * ; update(st1);
	 * 
	 * progressBar.setMaximum(page); progressBar.update(progressBar.getGraphics());
	 * progressBar.setValue(page); progressBar.update(progressBar.getGraphics());
	 * document.close(); }catch(Exception fg) { try{ document.close();
	 * }catch(Exception fh) {
	 * 
	 * } fg.printStackTrace(); StringWriter sw = new StringWriter();
	 * fg.printStackTrace(new PrintWriter(sw)); String exceptionAsString =
	 * sw.toString(); System.out.println(exceptionAsString);
	 * JOptionPane.showMessageDialog(null, ""+exceptionAsString+"", "ERROR!",
	 * JOptionPane.ERROR_MESSAGE); }
	 * 
	 * 
	 * return null; }
	 * 
	 * }; email.execute();
	 * 
	 * }
	 */
	public static BufferedImage crop(double amount, String ima) throws IOException {
		BufferedImage originalImage = ImageIO.read(new File(ima));
		int height = originalImage.getHeight();
		int width = originalImage.getWidth();

		int targetWidth = (int) (width * amount);

		// int targetWidth = 528;

		int targetHeight = (int) (height * amount);

		// int targetHeight = 623;

		System.out.println(targetWidth + "*" + targetHeight);
		// Coordinates of the image's middle
		int xc = (width - targetWidth) / 2;
		int yc = (height - targetHeight) / 2;

		// Crop
		BufferedImage croppedImage = originalImage.getSubimage(xc, yc, targetWidth, // widht
				targetHeight // height
		);
		JFileChooser fr = new JFileChooser();
		FileSystemView fw = fr.getFileSystemView();

		File direc = fw.getDefaultDirectory();
		// System.out.println(fw.getDefaultDirectory());
		java.awt.Image imgSmall = croppedImage.getScaledInstance(targetWidth, targetHeight,
				java.awt.Image.SCALE_SMOOTH);

		BufferedImage bufferedImage = convertToBufferedImage(imgSmall);

		ImageIO.write(croppedImage, "png", new File(fw.getDefaultDirectory() + "\\cropped\\Square.png"));

		return croppedImage;
	}

	public static void re(String im_path) throws IOException {

		crop(0.7950, im_path);
		// System.out.println(crop.getWidth() + "x" + crop.getHeight());

	}

	public static BufferedImage convertToBufferedImage(java.awt.Image image) {
		BufferedImage newImage = new BufferedImage(image.getWidth(null), image.getHeight(null),
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = newImage.createGraphics();
		g.drawImage(image, 0, 0, null);
		g.dispose();
		return newImage;
	}

	public static void captcha2() throws InterruptedException, IOException {
		Random r = new Random();
		int waitl = 1000;
		int waith = 5000;
		final int wait = r.nextInt(waith - waitl) + waitl;
		String path = new File(".").getCanonicalPath();
		System.out.println("Application path is: " + path);

		Thread.sleep(wait);

		try {
			if ((!driver2.findElement(By.xpath("//iframe[@title='recaptcha challenge']")).isDisplayed())) {
				System.out.println("catcha not present");

			} else {
				JavascriptExecutor js2 = (JavascriptExecutor) driver2;

				for (int k = 0; k < 10; k++) {
					// driver.navigate().refresh();

					if ((!driver2.findElement(By.xpath("//iframe[@title='recaptcha challenge']")).isDisplayed())) {
						System.out.println("catcha not present");
						k = 11;

					} else {

						System.out.println("catcha is present,solving");

						// WebElement
						// ca=driver.findElement(By.xpath("//div[@class='g-recaptcha']"));
						// String si=ca.getAttribute("data-sitekey");

						String si = "6Le-UyUUAAAAAIqgW-LsIp5Rn95m_0V0kt_q0Dl5";

						System.out.println(si);
						// Thread.sleep(5000);
						System.out.println("solving recaptcha");

						Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

						String t2 = String.valueOf(timestamp2);

						String st = "[" + t2 + "] Solving re-captcha";
						update(st);

						String url = driver2.getCurrentUrl();

						String apiKey = txtMahbubahacershaun.getText();
						String googleKey = "6LfbsiMUAAAAAOu1nGK8InBaFrIk17dcbI0sqvzj";
						String pageUrl = url;

						try {
							FileInputStream source = new FileInputStream(
									new File(path + "\\chromedriver\\js\\delete.txt"));
							sc = new Scanner(source);
							String js_TxtFile = "";
							while (sc.hasNext()) {
								String[] s = sc.next().split("\r\n");
								for (int i = 0; i < s.length; i++) {
									js_TxtFile += s[i];
									js_TxtFile += " ";
								}
							}
							js2.executeScript(js_TxtFile);
							sc.close();
							source.close();
						} catch (Exception hg) {

						}

						/*
						 * try {
						 * 
						 * // try { // System.out.println("Your balance is " + client.getBalance() +
						 * " US cents");
						 * 
						 * // balance(); } catch (IOException e) {
						 * System.out.println("Failed fetching balance: " + e.toString()); k=0;
						 * 
						 * }
						 */
						TwoCaptchaService service = new TwoCaptchaService(apiKey, googleKey, pageUrl);

						// Captcha captcha = null;
						/*
						 * try { // Upload a reCAPTCHA and poll for its status with 120 seconds timeout.
						 * // Put your proxy, proxy type, page googlekey, page url and solving timeout
						 * (in seconds) // 0 or nothing for the default timeout value. // captcha =
						 * client.decode("","",""+si+"",""+url+""); // captcha = client.decode("","",
						 * "6Le-UyUUAAAAAIqgW-LsIp5Rn95m_0V0kt_q0Dl5",url); //other method is to send a
						 * json with the parameters // JSONObject json_params = new JSONObject();
						 * json_params.put("proxy",""); json_params.put("proxytype","");
						 * json_params.put("googlekey",si); json_params.put("pageurl",url); captcha =
						 * client.decode(json_params); } catch (IOException e) {
						 * System.out.println("Failed uploading CAPTCHA");
						 * 
						 * st=" Nie udalo sie zaladowac captcha.";
						 * 
						 * update(st);
						 * 
						 * e.printStackTrace(); balance(); k=0; }
						 */
						try {
							String responseToken = service.solveCaptcha();
							System.out.println("The response token is: " + responseToken);

							js2.executeScript("document.getElementById('g-recaptcha-response').innerHTML='"
									+ responseToken + "';");

							Thread.sleep(3000);
							FileInputStream source = new FileInputStream(
									new File(path + "\\chromedriver\\js\\JsFile2.txt"));
							sc2 = new Scanner(source);
							String js_TxtFile = "";
							while (sc2.hasNext()) {
								String[] s = sc2.next().split("\r\n");
								for (int i = 0; i < s.length; i++) {
									js_TxtFile += s[i];
									js_TxtFile += " ";
								}
							}
							js2.executeScript(js_TxtFile);
							source.close();
							k = 110;
							timestamp2 = new Timestamp(System.currentTimeMillis());

							t2 = String.valueOf(timestamp2);

							st = "[" + t2 + "] Captcha solved";
							update(st);

						} catch (InterruptedException e) {
							System.out.println("ERROR case 1");
							k = 0;
							e.printStackTrace();
						} catch (IOException e) {
							System.out.println("ERROR case 2");
							k = 0;
						}

						/*
						 * if (null != captcha) { String solved=captcha.text;
						 * 
						 * System.out.println("CAPTCHA " + captcha.id + " solved: " + solved);
						 */
						/*
						 * try{
						 * 
						 * /* js.executeScript("alert('hello world');"); js.executeScript(
						 * "$('.g-recaptcha-response').css('display','true')");
						 */

						/*
						 * js2.executeScript(
						 * "document.getElementById('g-recaptcha-response').innerHTML='" +solved+"';");
						 * 
						 * Thread.sleep(3000); /*
						 * 
						 * try{ // js2.
						 * executeScript("function getParameterByName(name, url) {if (!url) url = window.location.href;name = name.replace(/[\\[\\]]/g, '\\$&'); var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)'),results = regex.exec(url);if (!results) return null;if (!results[2]) return '';return decodeURIComponent(results[2].replace(/\\+/g, ' ')); } var afterElement; let frames = document.getElementsByTagName('iframe'); for(let i = 0; i < frames.length; i++){ if(frames[i].offsetParent!=null){ let src = frames[i].getAttribute('src');if(src != null && src.startsWith('https://www.google.com/recaptcha')){ id = getParameterByName('k', src); if(id != '' && id != null){afterElement = frames[i];break;}}}}afterElement.closest('form').submit();"
						 * ); // let afterElement = null;
						 * 
						 * // js2.
						 * executeScript("let afterElement = null;afterElement.closest('form').submit();"
						 * );
						 * 
						 * 
						 * Scanner sc = new Scanner(new FileInputStream(new
						 * File("C:\\chromedriver\\js\\JsFile.txt"))); String js_TxtFile = ""; while
						 * (sc.hasNext()) { String[] s = sc.next().split("\r\n"); for (int i = 0; i <
						 * s.length; i++) { js_TxtFile += s[i]; js_TxtFile += " "; } }
						 * js2.executeScript(js_TxtFile);
						 * 
						 * 
						 * 
						 * 
						 * /* for(let i = 0; i < frames.length; i++){ if(frames[i].offsetParent!=null) {
						 * let src = frames[i].getAttribute('src'); if(src != null &&
						 * src.startsWith("https://www.google.com/recaptcha")){ id =
						 * getParameterByName("k", src); if(id != "" && id != null){ afterElement =
						 * frames[i]; break; } } } } afterElement.closest('form').submit();");
						 */

						// WebElement element12 =
						// driver2.findElement((By.xpath("//button[@class='next-button
						// text-button']")));

						// element12.click();

						/*
						 * }catch(Exception ab)
						 * 
						 * { ab.printStackTrace();
						 * 
						 * 
						 * 
						 * try{ js2.
						 * executeScript("document.querySelector('#captcha > div.page-wrapper > div > main > div > form > input').click();"
						 * ); }catch(Exception fg) { k=0; }
						 */
						// }
						/*
						   */

						/*
						 * st="Captcha rozwiazana pomyslnie.";
						 * 
						 * update(st);
						 * 
						 * balance();
						 * 
						 * Thread.sleep(3000);
						 * 
						 * 
						 * 
						 * k=11; }catch(Exception ah) { ah.printStackTrace(); k=0; } } else {
						 * System.out.println("Failed solving CAPTCHA");
						 * 
						 * st=" Problem z rozwiazywaniem captchy, ponawianie proby" ;
						 * 
						 * update(st);
						 * 
						 * 
						 * balance(); k=0; }
						 */
						/*
						 * } catch (com.DeathByCaptcha.Exception e) { System.out.println(e);
						 * 
						 * k=0; }
						 */
					}
				}

			}

		} catch (Exception ghg)

		{

			ghg.printStackTrace();
		}

	}

	static void RecursivePrint(File[] arr, int level) {
		// for-each loop for main directory files
		for (File f : arr) {
			// tabs for internal levels
			for (int i = 0; i < level; i++)
				System.out.print("\t");

			if (f.isFile()) {
				System.out.println(f.getName());
				if (f.getName().contains(".xlsx")) {
					try {
						Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

						String t2 = String.valueOf(timestamp2);

						String st = "[" + t2 + "] " + f.getAbsolutePath() + "";
						update(st);
					} catch (Exception fh) {

					}

					excel_sh = f.getAbsolutePath();
				} else {
					try {
						Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());

						String t2 = String.valueOf(timestamp2);

						String st = "[" + t2 + "] " + f.getAbsolutePath() + "";
						update(st);
						ar.add(f.getAbsolutePath());
					} catch (Exception hh) {

					}
				}
			}

			else if (f.isDirectory()) {
				System.out.println("[" + f.getName() + "]");

				// recursion for sub-directories
				RecursivePrint(f.listFiles(), level + 1);
			}
		}
	}
}
