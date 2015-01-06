/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;

import model.Booking;
import model.DatabaseInterface;
import model.Expense;
import model.ModelPackage;
import model.Receipt;
import model.ReceiptExpert;
import model.Room;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ReceiptExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiptExpertImpl extends MinimalEObjectImpl.Container implements ReceiptExpert {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected DatabaseInterface database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptExpertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RECEIPT_EXPERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (DatabaseInterface)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RECEIPT_EXPERT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseInterface basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(DatabaseInterface newDatabase) {
		DatabaseInterface oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RECEIPT_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt getReceipt(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<String> result =  database.query("SELECT * FROM tlbReceipts WHERE ReceiptID = " + ID);
		EList<String> expenses = database.query("SELECT * FROM tblExpenses WHERE ReceiptID = " + ID);
		EList<Expense> mylist = new BasicEList<Expense>();
		Calendar date = Calendar.getInstance();
		Receipt r1 = new ReceiptImpl();
		Expense ex = new ExpenseImpl();
		
		if (result != null){
			for (String exp : expenses){
				String[] arr = exp.split(";");
				date.setTimeInMillis(Long.parseLong(arr[2]));
				ex.Expense(Integer.parseInt(arr[0]), arr[1],
						date.getTime(), arr[3], Double.parseDouble(arr[4]), 
						Boolean.parseBoolean(arr[5]));
				mylist.add(ex);
				
			}

			for (String e: result){
				String[] s = e.split(";");
				date.setTimeInMillis(Long.parseLong(s[3]));
				r1.Receipt(Integer.parseInt(s[0]), date.getTime(), mylist );
			}
			
			return r1;
		//throw new UnsupportedOperationException();
		}else{
			return null;
		}
		// What about TotalCost??
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt getReceipt(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<String> rp = database.query("SELECT * FROM tblReceipts WHERE ReceiptID = "
				+ "(SELECT ReceiptID FROM tlbBooking WHERE BookingID = " + booking.getId());
		EList<String> expenses = database.query("SELECT * FROM tblExpenses WHERE ReceiptID = " + booking.getReceipt().getId());
		EList<Expense> mylist = new BasicEList<Expense>();
		Calendar date = Calendar.getInstance();
		Receipt r1 = new ReceiptImpl();
		Expense ex = new ExpenseImpl();
		
		if (rp != null){
			for (String exp : expenses){
				String[] arr = exp.split(";");
				date.setTimeInMillis(Long.parseLong(arr[2]));
				ex.Expense(Integer.parseInt(arr[0]), arr[1],
						date.getTime(), arr[3], Double.parseDouble(arr[4]), 
						Boolean.parseBoolean(arr[5]));
				mylist.add(ex);
				
			}

			for (String e: rp){
				String[] s = e.split(";");
				date.setTimeInMillis(Long.parseLong(s[3]));
				r1.Receipt(Integer.parseInt(s[0]), date.getTime(), mylist );
			}
			
			return r1;
		//throw new UnsupportedOperationException();
		}else{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt getReceipt(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<String> rp = database.query("SELECT * FROM tblReceipts WHERE ReceiptID = "
				+ room.getReceipt().getId());
		EList<String> expenses = database.query("SELECT * FROM tblExpenses WHERE ReceiptID = " +
				room.getReceipt().getId());
		EList<Expense> mylist = new BasicEList<Expense>();
		Calendar date = Calendar.getInstance();
		Receipt r1 = new ReceiptImpl();
		Expense ex = new ExpenseImpl();
		
		if (rp != null){
			for (String exp : expenses){
				String[] arr = exp.split(";");
				date.setTimeInMillis(Long.parseLong(arr[2]));
				ex.Expense(Integer.parseInt(arr[0]), arr[1],
						date.getTime(), arr[3], Double.parseDouble(arr[4]), 
						Boolean.parseBoolean(arr[5]));
				mylist.add(ex);
				
			}

			for (String e: rp){
				String[] s = e.split(";");
				date.setTimeInMillis(Long.parseLong(s[3]));
				r1.Receipt(Integer.parseInt(s[0]), date.getTime(), mylist );
			}
			
			return r1;
		//throw new UnsupportedOperationException();
		}else{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Receipt> getAllReceipt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		EList<String> receipt = database.query("SELECT * FROM tblReceipts");
		EList<Receipt> mylist = new BasicEList<Receipt>();
		EList<Expense> mylistEx = new BasicEList<Expense>();
		Calendar date = Calendar.getInstance();
		for(String r : receipt){
			String[] s = r.split(";");
			EList<String> expenses = database.query("SELECT * FROM tblExpenses WHERE ReceiptID = " + s[0]);
			for(String e: expenses){
				String[] a = e.split(";");
				Expense exp = new ExpenseImpl();
				date.setTimeInMillis(Long.parseLong(a[2]));
				exp.Expense(Integer.parseInt(a[0]), a[1], date.getTime(), a[3], Double.parseDouble(a[5]), Boolean.parseBoolean(a[6]));
				mylistEx.add(exp);
			}
			
			Receipt rp = new ReceiptImpl();
			date.setTimeInMillis(Long.parseLong(s[3]));
			rp.Receipt(Integer.parseInt(s[0]), date.getTime(), mylistEx);
			mylist.add(rp);
		}
		
		
		
		//throw new UnsupportedOperationException();
		return mylist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt combine(EList<Receipt> receiptList) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		// id, Date date, EList<Expense> expenses
		Receipt r = new ReceiptImpl();
		EList<Expense> exp = new BasicEList<Expense>();
		int total = 0; 
		for(int i= 0; i < receiptList.size(); i++){
			 r = receiptList.get(i);
			 exp.addAll(r.getExpenses());
			 
			//database.send("UPDATE tblExpenses SET ReceiptID = " + r.getId() + "WHERE ReceiptID = " 
				//	+ r2.getId());
			total += r.getTotalCost(); 
			//removeReceipt(r2);
		}
		
		r.setTotalCost(total);
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Receipt addReceipt(Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		Receipt r = receipt;
		
		database.send("INSERT INTO tblReceipts (ReceiptID, ReceiptDescription, "
					+ "TotalCost, ReceiptDate)  VALUES (" + r.getId() + ", " + 
					r.getExpenses() + ", " + r.getTotalCost() + ", " + 
					r.getDate());
		 
		 
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeReceipt(Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
	 
		return database.send("DELETE * FROM tblReceipts WHERE ReceiptID = " 
				+ receipt.getId());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateReceipt(Receipt receipt) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return database.send("UPDATE tblReceipts WHERE ReceiptID = " + receipt.getId() + 
				"SET ReceiptDescription = " + receipt.getExpenses() + "TotalCost = " +
				receipt.getTotalCost() + "ReceiptDate" + receipt.getDate());
		//throw new UnsupportedOperationException();
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ReceiptExpert(DatabaseInterface database) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		this.database = database; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				setDatabase((DatabaseInterface)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.RECEIPT_EXPERT__DATABASE:
				return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.RECEIPT_EXPERT___GET_RECEIPT__INT:
				return getReceipt((Integer)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___GET_RECEIPT__BOOKING:
				return getReceipt((Booking)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___GET_RECEIPT__ROOM:
				return getReceipt((Room)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___GET_ALL_RECEIPT:
				return getAllReceipt();
			case ModelPackage.RECEIPT_EXPERT___COMBINE__ELIST:
				return combine((EList<Receipt>)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___ADD_RECEIPT__RECEIPT:
				return addReceipt((Receipt)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___REMOVE_RECEIPT__RECEIPT:
				return removeReceipt((Receipt)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___UPDATE_RECEIPT__RECEIPT:
				return updateReceipt((Receipt)arguments.get(0));
			case ModelPackage.RECEIPT_EXPERT___RECEIPT_EXPERT__DATABASEINTERFACE:
				ReceiptExpert((DatabaseInterface)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceiptExpertImpl