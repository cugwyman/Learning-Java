package calculator;

import org.eclipse.osgi.internal.serviceregistry.ServiceConsumer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class CalculatorUI extends Shell {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text text;
	private int num_one = 0;
	private int num_two = 0;
	private int result = 0;
	private String text_one = "";
	private String text_two = "";
	private String text_result;
	private int cnt = 0;
	private int calculate_sign = 0;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			CalculatorUI shell = new CalculatorUI(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the shell.
	 * @param display
	 */
	public CalculatorUI(Display display) {
		super(display, SWT.SHELL_TRIM);
		setLayout(null);
		
		Button button = formToolkit.createButton(this, "1", SWT.NONE);
		button.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setBounds(30, 106, 120, 60);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if(cnt == 0) {
					text_one += "1";
					text.setText(text_one);
				}
				else {
					text_two += "1";
					text.setText(text_two);
				}
			}
		});
		
		Button button_1 = formToolkit.createButton(this, "2", SWT.NONE);
		button_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_1.setBounds(156, 106, 120, 60);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "2";
					text.setText(text_one);
				}
				else {
					text_two += "2";
					text.setText(text_two);
				}
			}
		});
		
		Button button_2 = formToolkit.createButton(this, "3", SWT.NONE);
		button_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_2.setBounds(282, 106, 120, 60);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "3";
					text.setText(text_one);
				}
				else {
					text_two += "3";
					text.setText(text_two);
				}
			}
		});
		
		Button button_3 = formToolkit.createButton(this, "4", SWT.NONE);
		button_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_3.setBounds(30, 172, 120, 60);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "4";
					text.setText(text_one);
				}
				else {
					text_two += "4";
					text.setText(text_two);
				}
			}
		});
		
		Button button_4 = formToolkit.createButton(this, "5", SWT.NONE);
		button_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_4.setBounds(156, 172, 120, 60);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "5";
					text.setText(text_one);
				}
				else {
					text_two += "5";
					text.setText(text_two);
				}
			}
		});
		
		Button button_5 = formToolkit.createButton(this, "6", SWT.NONE);
		button_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_5.setBounds(282, 172, 120, 60);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "6";
					text.setText(text_one);
				}
				else {
					text_two += "6";
					text.setText(text_two);
				}
			}
		});
		
		Button button_6 = formToolkit.createButton(this, "7", SWT.NONE);
		button_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_6.setBounds(30, 238, 120, 60);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "7";
					text.setText(text_one);
				}
				else {
					text_two += "7";
					text.setText(text_two);
				}
			}
		});
		
		Button button_7 = formToolkit.createButton(this, "8", SWT.NONE);
		button_7.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_7.setBounds(156, 238, 120, 60);
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "8";
					text.setText(text_one);
				}
				else {
					text_two += "8";
					text.setText(text_two);
				}
			}
		});
		
		Button button_8 = formToolkit.createButton(this, "9", SWT.NONE);
		button_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_8.setBounds(282, 238, 120, 60);
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "9";
					text.setText(text_one);
				}
				else {
					text_two += "9";
					text.setText(text_two);
				}
			}
		});
		
		Button button_9 = formToolkit.createButton(this, "0", SWT.NONE);
		button_9.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_9.setBounds(156, 304, 120, 60);
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one += "0";
					text.setText(text_one);
				}
				else {
					text_two += "0";
					text.setText(text_two);
				}
			}
		});
		
		Button btnC = formToolkit.createButton(this, "C", SWT.NONE);
		btnC.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		btnC.setBounds(30, 304, 120, 60);
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(cnt == 0) {
					text_one = "";
					text.setText(text_one);
				}
				else {
					text_two = "";
					text.setText(text_two);
				}
			}
		});
		
		Button button_13 = formToolkit.createButton(this, "=", SWT.NONE);
		button_13.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_13.setBounds(282, 304, 120, 60);
		button_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				num_one = Integer.valueOf(text_one);
				num_two = Integer.valueOf(text_two);
				if(calculate_sign == 1)
					result = num_one + num_two;
				else if(calculate_sign == 2)
					result = num_one - num_two;
				else if(calculate_sign == 3)
					result = num_one * num_two;
				else if(calculate_sign == 4)
					result = num_one / num_two;
				else if(calculate_sign == 0)
					result = num_one + 0;
				text_result = String.valueOf(result);
				cnt = 0;
				calculate_sign = 0;
				text_one = "";
				text_two = "";
				text.setText(text_result);
			}
		});
		
		Button button_10 = formToolkit.createButton(this, "+", SWT.NONE);
		button_10.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_10.setBounds(408, 106, 120, 60);
		button_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cnt++;
				calculate_sign = 1;
				text.setText("+");
			}
		});
		
		Button button_11 = formToolkit.createButton(this, "-", SWT.NONE);
		button_11.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_11.setBounds(408, 172, 120, 60);
		button_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cnt++;
				calculate_sign = 2;
				text.setText("-");
			}
		});
		
		Button button_12 = formToolkit.createButton(this, "*", SWT.NONE);
		button_12.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		button_12.setBounds(408, 238, 120, 60);
		button_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cnt++;
				calculate_sign = 3;
				text.setText("*");
			}
		});
		
		Button btnNewButton = formToolkit.createButton(this, "/", SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		btnNewButton.setBounds(408, 304, 120, 60);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cnt++;
				calculate_sign = 4;
				text.setText("/");
			}
		});
		
		text = new Text(this, SWT.BORDER | SWT.READ_ONLY | SWT.RIGHT | SWT.MULTI);
		text.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		text.setBounds(30, 21, 498, 69);
		formToolkit.adapt(text, true, true);
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Wyman's calculator");
		setSize(575, 443);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
