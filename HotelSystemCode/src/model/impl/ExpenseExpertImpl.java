/**
 * Author: Alexander Ask
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.DatabaseInterface;
import model.Expense;
import model.ExpenseExpert;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expense Expert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ExpenseExpertImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpenseExpertImpl extends MinimalEObjectImpl.Container implements ExpenseExpert {
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
	protected ExpenseExpertImpl() {
		super(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXPENSE_EXPERT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXPENSE_EXPERT__DATABASE, oldDatabase, database));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXPENSE_EXPERT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expense getExpense(int ID) {
		// TODO: implement this method 
		/**String[] response = database.query("SELECT * FROM tblExpense WHERE ExpenseID =" + ID + ";").get(0); 
		if(response != null){
			ExpenseImpl e = new ExpenseImpl();
			e.Expense(Integer.valueOf(response[0]), response[1], response[2], response[3]);
			return e; 
		}
		return null;**/ 
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Expense> getAllExpense() {
		// TODO: implement this method
		/**EList<String[]> strExpenses = database.query("SELECT * FROM tblExpense;");
		EList<Expense> expenses = new BasicEList<Expense>(); 
		if(strExpenses != null){
			for(String[] str : strExpenses){
				Expense e = new ExpenseImpl(); 
				e.Expense(Integer.valueOf(str[0]), str[1], str[2], str[3]);
				expenses.add(e); 
			}
		}
		Boolean.parseBoolean(s)
		return expenses; **/
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean addExpense(Expense expense) {
		// TODO: Date inom ''? 
		return database.create("INSERT INTO tblExpense (Price, ExpenseName, ExpenseDescription, ExpenseDate) VALUES(" + 
		expense.getPrice() + ", '" + expense.getName() + "', '" + expense.getDescription() + 
		"', " + expense.getDate() + ");" ); 
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean removeExpense(int ID) {
		return database.remove("DELETTE FROM tblExpense Where ExpenseID="+ID + ";"); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean updateExpense(Expense expense) {
		return database.update("UPDATE tblExpense SET Price=" + expense.getPrice() + ", ExpenseName='" + 
		expense.getName() + "', ExpenseDescription='" + expense.getDescription() + "', ExpenseDate='" + expense.getDate() + 
		"' WHERE ID =" + expense.getID()+ ";");  
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
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
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
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
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
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
			case ModelPackage.EXPENSE_EXPERT__DATABASE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EXPENSE_EXPERT___GET_EXPENSE__INT:
				return getExpense((Integer)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___GET_ALL_EXPENSE:
				return getAllExpense();
			case ModelPackage.EXPENSE_EXPERT___ADD_EXPENSE__EXPENSE:
				return addExpense((Expense)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___REMOVE_EXPENSE__INT:
				return removeExpense((Integer)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___UPDATE_EXPENSE__EXPENSE:
				return updateExpense((Expense)arguments.get(0));
			case ModelPackage.EXPENSE_EXPERT___EXPENSE_EXPERT__DATABASEINTERFACE:
				ExpenseExpert((DatabaseInterface)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}


	public void ExpenseExpert(DatabaseInterface database) {
		this.database = database; 		
	}

} //ExpenseExpertImpl
