/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.BankComponentImpl <em>Bank Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BankComponentImpl
	 * @see model.impl.ModelPackageImpl#getBankComponent()
	 * @generated
	 */
	int BANK_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Bank Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bank Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.HotelComponentImpl <em>Hotel Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.HotelComponentImpl
	 * @see model.impl.ModelPackageImpl#getHotelComponent()
	 * @generated
	 */
	int HOTEL_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Hotel Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hotel Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.ReceptionistImpl <em>Receptionist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReceptionistImpl
	 * @see model.impl.ModelPackageImpl#getReceptionist()
	 * @generated
	 */
	int RECEPTIONIST = 2;

	/**
	 * The number of structural features of the '<em>Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Receptionist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CustomersImpl <em>Customers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CustomersImpl
	 * @see model.impl.ModelPackageImpl#getCustomers()
	 * @generated
	 */
	int CUSTOMERS = 3;

	/**
	 * The number of structural features of the '<em>Customers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Customers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AdminImpl
	 * @see model.impl.ModelPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 4;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BankInterface <em>Bank Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BankInterface
	 * @see model.impl.ModelPackageImpl#getBankInterface()
	 * @generated
	 */
	int BANK_INTERFACE = 5;

	/**
	 * The number of structural features of the '<em>Bank Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bank Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.CustomerInterface <em>Customer Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.CustomerInterface
	 * @see model.impl.ModelPackageImpl#getCustomerInterface()
	 * @generated
	 */
	int CUSTOMER_INTERFACE = 6;

	/**
	 * The number of structural features of the '<em>Customer Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Search Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE___SEARCH_ROOMS__DATE_DATE_INT_INT = 0;

	/**
	 * The operation id for the '<em>Search Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE___SEARCH_ROOMS__DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Create Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT = 2;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE___PAY__CUSTOMER_RECEIPT = 3;

	/**
	 * The operation id for the '<em>Validate Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE___VALIDATE_CARD__STRING_STRING_INT_INT = 4;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE___CREATE_BOOKING__DATE_DATE_STRING_CUSTOMER_STRING_RECEIPT_STRING = 5;

	/**
	 * The number of operations of the '<em>Customer Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_INTERFACE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RoomImpl
	 * @see model.impl.ModelPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 7;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__EXPENSE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Clean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CLEAN = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BEDS = 6;

	/**
	 * The feature id for the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__RECEIPT = 7;

	/**
	 * The feature id for the '<em><b>Resident</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__RESIDENT = 8;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ROOM__INT_STRING_STRING_INT_INT = 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ExpenseImpl <em>Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExpenseImpl
	 * @see model.impl.ModelPackageImpl#getExpense()
	 * @generated
	 */
	int EXPENSE = 8;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__DATE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__ID = 4;

	/**
	 * The number of structural features of the '<em>Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE___EXPENSE__INT_STRING_STRING_DATE = 0;

	/**
	 * The number of operations of the '<em>Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ReceiptImpl <em>Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReceiptImpl
	 * @see model.impl.ModelPackageImpl#getReceipt()
	 * @generated
	 */
	int RECEIPT = 9;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__EXPENSE = 0;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__TOTAL_COST = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__DATE = 2;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__EXPENSES = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__ID = 4;

	/**
	 * The feature id for the '<em><b>Cashier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__CASHIER = 5;

	/**
	 * The number of structural features of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT___ADD_EXPENSE__EXPENSE = 0;

	/**
	 * The operation id for the '<em>Remove Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT___REMOVE_EXPENSE__EXPENSE = 1;

	/**
	 * The operation id for the '<em>Get All Expenses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT___GET_ALL_EXPENSES = 2;

	/**
	 * The number of operations of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.UserImpl
	 * @see model.impl.ModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 10;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 3;

	/**
	 * The feature id for the '<em><b>Receptionist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RECEPTIONIST = 4;

	/**
	 * The feature id for the '<em><b>Administrator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADMINISTRATOR = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.ResidentImpl <em>Resident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ResidentImpl
	 * @see model.impl.ModelPackageImpl#getResident()
	 * @generated
	 */
	int RESIDENT = 11;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Passport Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT__PASSPORT_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Resident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Resident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT___RESIDENT__STRING_STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Resident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CustomerImpl
	 * @see model.impl.ModelPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 12;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADRESS = 3;

	/**
	 * The feature id for the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CC_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CCV = 5;

	/**
	 * The feature id for the '<em><b>Expiring Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EXPIRING_MONTH = 6;

	/**
	 * The feature id for the '<em><b>Expiring Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EXPIRING_YEAR = 7;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.ReceptionistInterface <em>Receptionist Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ReceptionistInterface
	 * @see model.impl.ModelPackageImpl#getReceptionistInterface()
	 * @generated
	 */
	int RECEPTIONIST_INTERFACE = 13;

	/**
	 * The number of structural features of the '<em>Receptionist Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Resident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___CREATE_RESIDENT__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>View All Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___VIEW_ALL_BOOKINGS__DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___GET_BOOKING__STRING = 2;

	/**
	 * The operation id for the '<em>View Un Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS = 3;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___GET_BOOKING__STRING_DATE_DATE = 4;

	/**
	 * The operation id for the '<em>View Un Occupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS__STRING = 5;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___CHECK_IN__BOOKING = 6;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE___CHECK_OUT__BOOKING = 7;

	/**
	 * The number of operations of the '<em>Receptionist Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_INTERFACE_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link model.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BookingImpl
	 * @see model.impl.ModelPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 14;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__FROM_DATE = 2;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__TO_DATE = 3;

	/**
	 * The feature id for the '<em><b>Wishes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__WISHES = 4;

	/**
	 * The feature id for the '<em><b>Promotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__PROMOTION = 5;

	/**
	 * The feature id for the '<em><b>Room Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECKED_IN = 7;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___BOOKING__STRING_DATE_DATE_STRING_CUSTOMER_ELIST_STRING = 0;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.AdminInterface <em>Admin Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.AdminInterface
	 * @see model.impl.ModelPackageImpl#getAdminInterface()
	 * @generated
	 */
	int ADMIN_INTERFACE = 15;

	/**
	 * The number of structural features of the '<em>Admin Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___LOGIN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Create Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___CREATE_ROOM__INT_STRING_STRING_INT_INT = 1;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___REMOVE_ROOM__ROOM = 2;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___UPDATE_ROOM__ROOM = 3;

	/**
	 * The operation id for the '<em>Create User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___CREATE_USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN = 4;

	/**
	 * The operation id for the '<em>Remove User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___REMOVE_USER__USER = 5;

	/**
	 * The operation id for the '<em>Update User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___UPDATE_USER__USER = 6;

	/**
	 * The operation id for the '<em>Create Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___CREATE_PROMOTION__STRING_STRING_INT_DATE = 7;

	/**
	 * The operation id for the '<em>Remove Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___REMOVE_PROMOTION__PROMOTION = 8;

	/**
	 * The operation id for the '<em>Update Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___UPDATE_PROMOTION__PROMOTION = 9;

	/**
	 * The operation id for the '<em>Create Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___CREATE_EXPENSE__INT_STRING_STRING_DATE_BOOLEAN = 10;

	/**
	 * The operation id for the '<em>Remove Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___REMOVE_EXPENSE__EXPENSE = 11;

	/**
	 * The operation id for the '<em>Update Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___UPDATE_EXPENSE__EXPENSE = 12;

	/**
	 * The operation id for the '<em>View Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___VIEW_ROOMS = 13;

	/**
	 * The operation id for the '<em>View Promotions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___VIEW_PROMOTIONS = 14;

	/**
	 * The operation id for the '<em>View Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___VIEW_USERS = 15;

	/**
	 * The operation id for the '<em>View Expenses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___VIEW_EXPENSES = 16;

	/**
	 * The operation id for the '<em>Admin Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE___ADMIN_CONTROLLER__ROOMEXPERT_EXPENSEEXPERT_USEREXPERT_PROMOTIONEXPERT = 17;

	/**
	 * The number of operations of the '<em>Admin Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_INTERFACE_OPERATION_COUNT = 18;

	/**
	 * The meta object id for the '{@link model.impl.PromotionImpl <em>Promotion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PromotionImpl
	 * @see model.impl.ModelPackageImpl#getPromotion()
	 * @generated
	 */
	int PROMOTION = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__CODE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__ID = 3;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__VALID_FROM = 4;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__VALID_TO = 5;

	/**
	 * The number of structural features of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Calculate Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION___CALCULATE_DISCOUNT__ROOM = 0;

	/**
	 * The number of operations of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.RoomExpertImpl <em>Room Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RoomExpertImpl
	 * @see model.impl.ModelPackageImpl#getRoomExpert()
	 * @generated
	 */
	int ROOM_EXPERT = 17;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>Room Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get All Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___GET_ALL_ROOMS = 0;

	/**
	 * The operation id for the '<em>Get Available Room Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___GET_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT = 1;

	/**
	 * The operation id for the '<em>Get Unoccupied Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___GET_UNOCCUPIED_ROOMS = 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___ADD_ROOM__ROOM = 3;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___REMOVE_ROOM__ROOM = 4;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___UPDATE_ROOM__ROOM = 5;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT___GET_ROOM__INT = 6;

	/**
	 * The number of operations of the '<em>Room Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXPERT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.DatabaseInterface <em>Database Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.DatabaseInterface
	 * @see model.impl.ModelPackageImpl#getDatabaseInterface()
	 * @generated
	 */
	int DATABASE_INTERFACE = 18;

	/**
	 * The number of structural features of the '<em>Database Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Querystringrow Array Lst</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___QUERYSTRINGROW_ARRAY_LST = 0;

	/**
	 * The operation id for the '<em>Updatestringboolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___UPDATESTRINGBOOLEAN = 1;

	/**
	 * The operation id for the '<em>Createstringboolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___CREATESTRINGBOOLEAN = 2;

	/**
	 * The operation id for the '<em>Removestringboolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___REMOVESTRINGBOOLEAN = 3;

	/**
	 * The operation id for the '<em>Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___QUERY__STRING = 4;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___UPDATE__STRING = 5;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___CREATE__STRING = 6;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE___REMOVE__STRING = 7;

	/**
	 * The number of operations of the '<em>Database Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_INTERFACE_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link model.impl.ExpenseExpertImpl <em>Expense Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExpenseExpertImpl
	 * @see model.impl.ModelPackageImpl#getExpenseExpert()
	 * @generated
	 */
	int EXPENSE_EXPERT = 19;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>Expense Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT___GET_EXPENSE__INT = 0;

	/**
	 * The operation id for the '<em>Get All Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT___GET_ALL_EXPENSE = 1;

	/**
	 * The operation id for the '<em>Add Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT___ADD_EXPENSE__EXPENSE = 2;

	/**
	 * The operation id for the '<em>Remove Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT___REMOVE_EXPENSE__INT = 3;

	/**
	 * The operation id for the '<em>Update Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT___UPDATE_EXPENSE__EXPENSE = 4;

	/**
	 * The number of operations of the '<em>Expense Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_EXPERT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.impl.UserExpertImpl <em>User Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.UserExpertImpl
	 * @see model.impl.ModelPackageImpl#getUserExpert()
	 * @generated
	 */
	int USER_EXPERT = 20;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>User Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT___GET_USER__INT = 0;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT___GET_ALL_USERS = 1;

	/**
	 * The operation id for the '<em>Add User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT___ADD_USER__USER = 2;

	/**
	 * The operation id for the '<em>Remove User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT___REMOVE_USER__INT = 3;

	/**
	 * The operation id for the '<em>Update User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT___UPDATE_USER__USER = 4;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT___LOGIN__STRING_STRING = 5;

	/**
	 * The number of operations of the '<em>User Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_EXPERT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link model.impl.PromotionExpertImpl <em>Promotion Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PromotionExpertImpl
	 * @see model.impl.ModelPackageImpl#getPromotionExpert()
	 * @generated
	 */
	int PROMOTION_EXPERT = 21;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>Promotion Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT___GET_PROMOTION__INT = 0;

	/**
	 * The operation id for the '<em>Get Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT___GET_PROMOTION__STRING = 1;

	/**
	 * The operation id for the '<em>Get All Promotions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT___GET_ALL_PROMOTIONS = 2;

	/**
	 * The operation id for the '<em>Remove Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT___REMOVE_PROMOTION__INT = 3;

	/**
	 * The operation id for the '<em>Update Promotion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT___UPDATE_PROMOTION__PROMOTION = 4;

	/**
	 * The number of operations of the '<em>Promotion Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_EXPERT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.impl.BookingExpertImpl <em>Booking Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BookingExpertImpl
	 * @see model.impl.ModelPackageImpl#getBookingExpert()
	 * @generated
	 */
	int BOOKING_EXPERT = 22;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>Booking Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___GET_BOOKING__INT = 0;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___GET_BOOKING__STRING = 1;

	/**
	 * The operation id for the '<em>Get All Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___GET_ALL_BOOKING__DATE_DATE = 2;

	/**
	 * The operation id for the '<em>Get All Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___GET_ALL_BOOKINGS = 3;

	/**
	 * The operation id for the '<em>Add Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___ADD_BOOKING__BOOKING = 4;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___REMOVE_BOOKING__BOOKING = 5;

	/**
	 * The operation id for the '<em>Update Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___UPDATE_BOOKING__BOOKING = 6;

	/**
	 * The operation id for the '<em>Get All Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT___GET_ALL_BOOKINGS__STRING = 7;

	/**
	 * The number of operations of the '<em>Booking Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_EXPERT_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link model.impl.ReceiptExpertImpl <em>Receipt Expert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReceiptExpertImpl
	 * @see model.impl.ModelPackageImpl#getReceiptExpert()
	 * @generated
	 */
	int RECEIPT_EXPERT = 23;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>Receipt Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___GET_RECEIPT__INT = 0;

	/**
	 * The operation id for the '<em>Get Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___GET_RECEIPT__BOOKING = 1;

	/**
	 * The operation id for the '<em>Get All Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___GET_ALL_RECEIPT = 2;

	/**
	 * The operation id for the '<em>Combine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___COMBINE__RECEIPT = 3;

	/**
	 * The operation id for the '<em>Add Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___ADD_RECEIPT__RECEIPT = 4;

	/**
	 * The operation id for the '<em>Remove Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___REMOVE_RECEIPT__RECEIPT = 5;

	/**
	 * The operation id for the '<em>Update Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT___UPDATE_RECEIPT__RECEIPT = 6;

	/**
	 * The number of operations of the '<em>Receipt Expert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_EXPERT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.impl.emailImpl <em>email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.emailImpl
	 * @see model.impl.ModelPackageImpl#getemail()
	 * @generated
	 */
	int EMAIL = 24;

	/**
	 * The number of structural features of the '<em>email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___SEND__BOOKING = 0;

	/**
	 * The number of operations of the '<em>email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PaymentImpl
	 * @see model.impl.ModelPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 25;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___MAKE_PAYMENT__CUSTOMER_INT = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Validcustomer Bool</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___IS_CREDIT_CARD_VALIDCUSTOMER_BOOL = 1;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BookingControllerImpl
	 * @see model.impl.ModelPackageImpl#getBookingController()
	 * @generated
	 */
	int BOOKING_CONTROLLER = 26;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Booking Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__BOOKING_EXPERT = 1;

	/**
	 * The feature id for the '<em><b>Promotion Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__PROMOTION_EXPERT = 2;

	/**
	 * The feature id for the '<em><b>Database Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER__DATABASE_INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Booking Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.AdminControllerImpl <em>Admin Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AdminControllerImpl
	 * @see model.impl.ModelPackageImpl#getAdminController()
	 * @generated
	 */
	int ADMIN_CONTROLLER = 27;

	/**
	 * The feature id for the '<em><b>User Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__USER_EXPERT = 0;

	/**
	 * The feature id for the '<em><b>Expense Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__EXPENSE_EXPERT = 1;

	/**
	 * The feature id for the '<em><b>Promo Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__PROMO_EXPERT = 2;

	/**
	 * The feature id for the '<em><b>Database Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER__DATABASE_INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Admin Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Admin Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.ReceptionistControllerImpl <em>Receptionist Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReceptionistControllerImpl
	 * @see model.impl.ModelPackageImpl#getReceptionistController()
	 * @generated
	 */
	int RECEPTIONIST_CONTROLLER = 28;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER__ROOM = BOOKING_CONTROLLER__ROOM;

	/**
	 * The feature id for the '<em><b>Booking Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER__BOOKING_EXPERT = BOOKING_CONTROLLER__BOOKING_EXPERT;

	/**
	 * The feature id for the '<em><b>Promotion Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER__PROMOTION_EXPERT = BOOKING_CONTROLLER__PROMOTION_EXPERT;

	/**
	 * The feature id for the '<em><b>Database Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER__DATABASE_INTERFACE = BOOKING_CONTROLLER__DATABASE_INTERFACE;

	/**
	 * The feature id for the '<em><b>Expense Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT = BOOKING_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Expert</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER__ROOM_EXPERT = BOOKING_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Receptionist Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER_FEATURE_COUNT = BOOKING_CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Receptionist Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPTIONIST_CONTROLLER_OPERATION_COUNT = BOOKING_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.MSAccessDBImpl <em>MS Access DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MSAccessDBImpl
	 * @see model.impl.ModelPackageImpl#getMSAccessDB()
	 * @generated
	 */
	int MS_ACCESS_DB = 29;

	/**
	 * The number of structural features of the '<em>MS Access DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_ACCESS_DB_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>MS Access DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_ACCESS_DB_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.BankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Component</em>'.
	 * @see model.BankComponent
	 * @generated
	 */
	EClass getBankComponent();

	/**
	 * Returns the meta object for class '{@link model.HotelComponent <em>Hotel Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Component</em>'.
	 * @see model.HotelComponent
	 * @generated
	 */
	EClass getHotelComponent();

	/**
	 * Returns the meta object for class '{@link model.Receptionist <em>Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receptionist</em>'.
	 * @see model.Receptionist
	 * @generated
	 */
	EClass getReceptionist();

	/**
	 * Returns the meta object for class '{@link model.Customers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customers</em>'.
	 * @see model.Customers
	 * @generated
	 */
	EClass getCustomers();

	/**
	 * Returns the meta object for class '{@link model.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see model.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for class '{@link model.BankInterface <em>Bank Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Interface</em>'.
	 * @see model.BankInterface
	 * @generated
	 */
	EClass getBankInterface();

	/**
	 * Returns the meta object for class '{@link model.CustomerInterface <em>Customer Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Interface</em>'.
	 * @see model.CustomerInterface
	 * @generated
	 */
	EClass getCustomerInterface();

	/**
	 * Returns the meta object for the '{@link model.CustomerInterface#searchRooms(java.util.Date, java.util.Date, int, int) <em>Search Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Rooms</em>' operation.
	 * @see model.CustomerInterface#searchRooms(java.util.Date, java.util.Date, int, int)
	 * @generated
	 */
	EOperation getCustomerInterface__SearchRooms__Date_Date_int_int();

	/**
	 * Returns the meta object for the '{@link model.CustomerInterface#searchRooms(java.util.Date, java.util.Date) <em>Search Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Rooms</em>' operation.
	 * @see model.CustomerInterface#searchRooms(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getCustomerInterface__SearchRooms__Date_Date();

	/**
	 * Returns the meta object for the '{@link model.CustomerInterface#createCustomer(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int) <em>Create Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Customer</em>' operation.
	 * @see model.CustomerInterface#createCustomer(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getCustomerInterface__CreateCustomer__String_String_String_String_String_String_int_int();

	/**
	 * Returns the meta object for the '{@link model.CustomerInterface#pay(model.Customer, model.Receipt) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see model.CustomerInterface#pay(model.Customer, model.Receipt)
	 * @generated
	 */
	EOperation getCustomerInterface__Pay__Customer_Receipt();

	/**
	 * Returns the meta object for the '{@link model.CustomerInterface#validateCard(java.lang.String, java.lang.String, int, int) <em>Validate Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Card</em>' operation.
	 * @see model.CustomerInterface#validateCard(java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getCustomerInterface__ValidateCard__String_String_int_int();

	/**
	 * Returns the meta object for the '{@link model.CustomerInterface#createBooking(java.util.Date, java.util.Date, java.lang.String, model.Customer, java.lang.String, model.Receipt, java.lang.String) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see model.CustomerInterface#createBooking(java.util.Date, java.util.Date, java.lang.String, model.Customer, java.lang.String, model.Receipt, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerInterface__CreateBooking__Date_Date_String_Customer_String_Receipt_String();

	/**
	 * Returns the meta object for class '{@link model.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see model.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link model.Room#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expense</em>'.
	 * @see model.Room#getExpense()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Expense();

	/**
	 * Returns the meta object for the attribute '{@link model.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see model.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the meta object for the attribute '{@link model.Room#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see model.Room#getDescription()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Description();

	/**
	 * Returns the meta object for the attribute '{@link model.Room#isClean <em>Clean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean</em>'.
	 * @see model.Room#isClean()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Clean();

	/**
	 * Returns the meta object for the attribute '{@link model.Room#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Room#getType()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Type();

	/**
	 * Returns the meta object for the reference '{@link model.Room#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see model.Room#getPrice()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Price();

	/**
	 * Returns the meta object for the attribute '{@link model.Room#getBeds <em>Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beds</em>'.
	 * @see model.Room#getBeds()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Beds();

	/**
	 * Returns the meta object for the reference '{@link model.Room#getReceipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt</em>'.
	 * @see model.Room#getReceipt()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Receipt();

	/**
	 * Returns the meta object for the reference list '{@link model.Room#getResident <em>Resident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resident</em>'.
	 * @see model.Room#getResident()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Resident();

	/**
	 * Returns the meta object for the '{@link model.Room#Room(int, java.lang.String, java.lang.String, int, int) <em>Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Room</em>' operation.
	 * @see model.Room#Room(int, java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getRoom__Room__int_String_String_int_int();

	/**
	 * Returns the meta object for class '{@link model.Expense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expense</em>'.
	 * @see model.Expense
	 * @generated
	 */
	EClass getExpense();

	/**
	 * Returns the meta object for the attribute '{@link model.Expense#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see model.Expense#getPrice()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Price();

	/**
	 * Returns the meta object for the attribute '{@link model.Expense#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Expense#getName()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Expense#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see model.Expense#getDescription()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Description();

	/**
	 * Returns the meta object for the attribute '{@link model.Expense#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see model.Expense#getDate()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Date();

	/**
	 * Returns the meta object for the attribute '{@link model.Expense#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.Expense#getID()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_ID();

	/**
	 * Returns the meta object for the '{@link model.Expense#Expense(int, java.lang.String, java.lang.String, java.util.Date) <em>Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expense</em>' operation.
	 * @see model.Expense#Expense(int, java.lang.String, java.lang.String, java.util.Date)
	 * @generated
	 */
	EOperation getExpense__Expense__int_String_String_Date();

	/**
	 * Returns the meta object for class '{@link model.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt</em>'.
	 * @see model.Receipt
	 * @generated
	 */
	EClass getReceipt();

	/**
	 * Returns the meta object for the reference list '{@link model.Receipt#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expense</em>'.
	 * @see model.Receipt#getExpense()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Expense();

	/**
	 * Returns the meta object for the attribute '{@link model.Receipt#getTotalCost <em>Total Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cost</em>'.
	 * @see model.Receipt#getTotalCost()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_TotalCost();

	/**
	 * Returns the meta object for the attribute '{@link model.Receipt#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see model.Receipt#getDate()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_Date();

	/**
	 * Returns the meta object for the reference list '{@link model.Receipt#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expenses</em>'.
	 * @see model.Receipt#getExpenses()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Expenses();

	/**
	 * Returns the meta object for the attribute '{@link model.Receipt#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.Receipt#getID()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_ID();

	/**
	 * Returns the meta object for the reference '{@link model.Receipt#getCashier <em>Cashier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cashier</em>'.
	 * @see model.Receipt#getCashier()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Cashier();

	/**
	 * Returns the meta object for the '{@link model.Receipt#addExpense(model.Expense) <em>Add Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Expense</em>' operation.
	 * @see model.Receipt#addExpense(model.Expense)
	 * @generated
	 */
	EOperation getReceipt__AddExpense__Expense();

	/**
	 * Returns the meta object for the '{@link model.Receipt#removeExpense(model.Expense) <em>Remove Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Expense</em>' operation.
	 * @see model.Receipt#removeExpense(model.Expense)
	 * @generated
	 */
	EOperation getReceipt__RemoveExpense__Expense();

	/**
	 * Returns the meta object for the '{@link model.Receipt#getAllExpenses() <em>Get All Expenses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Expenses</em>' operation.
	 * @see model.Receipt#getAllExpenses()
	 * @generated
	 */
	EOperation getReceipt__GetAllExpenses();

	/**
	 * Returns the meta object for class '{@link model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link model.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see model.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link model.User#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see model.User#getSurname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Surname();

	/**
	 * Returns the meta object for the attribute '{@link model.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see model.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link model.User#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.User#getID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.User#isReceptionist <em>Receptionist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receptionist</em>'.
	 * @see model.User#isReceptionist()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Receptionist();

	/**
	 * Returns the meta object for the attribute '{@link model.User#isAdministrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Administrator</em>'.
	 * @see model.User#isAdministrator()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Administrator();

	/**
	 * Returns the meta object for the '{@link model.User#User(java.lang.String, java.lang.String, java.lang.String, boolean, boolean) <em>User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User</em>' operation.
	 * @see model.User#User(java.lang.String, java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getUser__User__String_String_String_boolean_boolean();

	/**
	 * Returns the meta object for class '{@link model.Resident <em>Resident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resident</em>'.
	 * @see model.Resident
	 * @generated
	 */
	EClass getResident();

	/**
	 * Returns the meta object for the attribute '{@link model.Resident#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see model.Resident#getFirstName()
	 * @see #getResident()
	 * @generated
	 */
	EAttribute getResident_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link model.Resident#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see model.Resident#getSurname()
	 * @see #getResident()
	 * @generated
	 */
	EAttribute getResident_Surname();

	/**
	 * Returns the meta object for the attribute '{@link model.Resident#getPassportNumber <em>Passport Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passport Number</em>'.
	 * @see model.Resident#getPassportNumber()
	 * @see #getResident()
	 * @generated
	 */
	EAttribute getResident_PassportNumber();

	/**
	 * Returns the meta object for the '{@link model.Resident#Resident(java.lang.String, java.lang.String, java.lang.String) <em>Resident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resident</em>' operation.
	 * @see model.Resident#Resident(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getResident__Resident__String_String_String();

	/**
	 * Returns the meta object for class '{@link model.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see model.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see model.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see model.Customer#getSurname()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Surname();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see model.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see model.Customer#getAdress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Adress();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see model.Customer#getCcNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see model.Customer#getCcv()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getExpiringMonth <em>Expiring Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiring Month</em>'.
	 * @see model.Customer#getExpiringMonth()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ExpiringMonth();

	/**
	 * Returns the meta object for the attribute '{@link model.Customer#getExpiringYear <em>Expiring Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiring Year</em>'.
	 * @see model.Customer#getExpiringYear()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ExpiringYear();

	/**
	 * Returns the meta object for class '{@link model.ReceptionistInterface <em>Receptionist Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receptionist Interface</em>'.
	 * @see model.ReceptionistInterface
	 * @generated
	 */
	EClass getReceptionistInterface();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#createResident(java.lang.String, java.lang.String, java.lang.String) <em>Create Resident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Resident</em>' operation.
	 * @see model.ReceptionistInterface#createResident(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getReceptionistInterface__CreateResident__String_String_String();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#viewAllBookings(java.util.Date, java.util.Date) <em>View All Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View All Bookings</em>' operation.
	 * @see model.ReceptionistInterface#viewAllBookings(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getReceptionistInterface__ViewAllBookings__Date_Date();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#getBooking(java.lang.String) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see model.ReceptionistInterface#getBooking(java.lang.String)
	 * @generated
	 */
	EOperation getReceptionistInterface__GetBooking__String();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#viewUnOccupiedRooms() <em>View Un Occupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Un Occupied Rooms</em>' operation.
	 * @see model.ReceptionistInterface#viewUnOccupiedRooms()
	 * @generated
	 */
	EOperation getReceptionistInterface__ViewUnOccupiedRooms();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#getBooking(java.lang.String, java.util.Date, java.util.Date) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see model.ReceptionistInterface#getBooking(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getReceptionistInterface__GetBooking__String_Date_Date();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#viewUnOccupiedRooms(java.lang.String) <em>View Un Occupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Un Occupied Rooms</em>' operation.
	 * @see model.ReceptionistInterface#viewUnOccupiedRooms(java.lang.String)
	 * @generated
	 */
	EOperation getReceptionistInterface__ViewUnOccupiedRooms__String();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#checkIn(model.Booking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see model.ReceptionistInterface#checkIn(model.Booking)
	 * @generated
	 */
	EOperation getReceptionistInterface__CheckIn__Booking();

	/**
	 * Returns the meta object for the '{@link model.ReceptionistInterface#checkOut(model.Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see model.ReceptionistInterface#checkOut(model.Booking)
	 * @generated
	 */
	EOperation getReceptionistInterface__CheckOut__Booking();

	/**
	 * Returns the meta object for class '{@link model.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see model.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the reference '{@link model.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see model.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_Customer();

	/**
	 * Returns the meta object for the attribute '{@link model.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see model.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link model.Booking#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see model.Booking#getFromDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link model.Booking#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see model.Booking#getToDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_ToDate();

	/**
	 * Returns the meta object for the attribute '{@link model.Booking#getWishes <em>Wishes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wishes</em>'.
	 * @see model.Booking#getWishes()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Wishes();

	/**
	 * Returns the meta object for the attribute '{@link model.Booking#getPromotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promotion</em>'.
	 * @see model.Booking#getPromotion()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Promotion();

	/**
	 * Returns the meta object for the attribute list '{@link model.Booking#getRoomTypes <em>Room Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Room Types</em>'.
	 * @see model.Booking#getRoomTypes()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_RoomTypes();

	/**
	 * Returns the meta object for the attribute '{@link model.Booking#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see model.Booking#isCheckedIn()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckedIn();

	/**
	 * Returns the meta object for the '{@link model.Booking#Booking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, model.Customer, org.eclipse.emf.common.util.EList, java.lang.String) <em>Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Booking</em>' operation.
	 * @see model.Booking#Booking(java.lang.String, java.util.Date, java.util.Date, java.lang.String, model.Customer, org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getBooking__Booking__String_Date_Date_String_Customer_EList_String();

	/**
	 * Returns the meta object for class '{@link model.AdminInterface <em>Admin Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Interface</em>'.
	 * @see model.AdminInterface
	 * @generated
	 */
	EClass getAdminInterface();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see model.AdminInterface#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdminInterface__Login__String_String();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#createRoom(int, java.lang.String, java.lang.String, int, int) <em>Create Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room</em>' operation.
	 * @see model.AdminInterface#createRoom(int, java.lang.String, java.lang.String, int, int)
	 * @generated
	 */
	EOperation getAdminInterface__CreateRoom__int_String_String_int_int();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#removeRoom(model.Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see model.AdminInterface#removeRoom(model.Room)
	 * @generated
	 */
	EOperation getAdminInterface__RemoveRoom__Room();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#updateRoom(model.Room) <em>Update Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room</em>' operation.
	 * @see model.AdminInterface#updateRoom(model.Room)
	 * @generated
	 */
	EOperation getAdminInterface__UpdateRoom__Room();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#createUser(java.lang.String, java.lang.String, java.lang.String, boolean, boolean) <em>Create User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create User</em>' operation.
	 * @see model.AdminInterface#createUser(java.lang.String, java.lang.String, java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getAdminInterface__CreateUser__String_String_String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#removeUser(model.User) <em>Remove User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove User</em>' operation.
	 * @see model.AdminInterface#removeUser(model.User)
	 * @generated
	 */
	EOperation getAdminInterface__RemoveUser__User();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#updateUser(model.User) <em>Update User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update User</em>' operation.
	 * @see model.AdminInterface#updateUser(model.User)
	 * @generated
	 */
	EOperation getAdminInterface__UpdateUser__User();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#createPromotion(java.lang.String, java.lang.String, int, java.util.Date) <em>Create Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Promotion</em>' operation.
	 * @see model.AdminInterface#createPromotion(java.lang.String, java.lang.String, int, java.util.Date)
	 * @generated
	 */
	EOperation getAdminInterface__CreatePromotion__String_String_int_Date();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#removePromotion(model.Promotion) <em>Remove Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Promotion</em>' operation.
	 * @see model.AdminInterface#removePromotion(model.Promotion)
	 * @generated
	 */
	EOperation getAdminInterface__RemovePromotion__Promotion();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#updatePromotion(model.Promotion) <em>Update Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Promotion</em>' operation.
	 * @see model.AdminInterface#updatePromotion(model.Promotion)
	 * @generated
	 */
	EOperation getAdminInterface__UpdatePromotion__Promotion();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#createExpense(int, java.lang.String, java.lang.String, java.util.Date, boolean) <em>Create Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Expense</em>' operation.
	 * @see model.AdminInterface#createExpense(int, java.lang.String, java.lang.String, java.util.Date, boolean)
	 * @generated
	 */
	EOperation getAdminInterface__CreateExpense__int_String_String_Date_boolean();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#removeExpense(model.Expense) <em>Remove Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Expense</em>' operation.
	 * @see model.AdminInterface#removeExpense(model.Expense)
	 * @generated
	 */
	EOperation getAdminInterface__RemoveExpense__Expense();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#updateExpense(model.Expense) <em>Update Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Expense</em>' operation.
	 * @see model.AdminInterface#updateExpense(model.Expense)
	 * @generated
	 */
	EOperation getAdminInterface__UpdateExpense__Expense();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#viewRooms() <em>View Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Rooms</em>' operation.
	 * @see model.AdminInterface#viewRooms()
	 * @generated
	 */
	EOperation getAdminInterface__ViewRooms();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#viewPromotions() <em>View Promotions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Promotions</em>' operation.
	 * @see model.AdminInterface#viewPromotions()
	 * @generated
	 */
	EOperation getAdminInterface__ViewPromotions();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#viewUsers() <em>View Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Users</em>' operation.
	 * @see model.AdminInterface#viewUsers()
	 * @generated
	 */
	EOperation getAdminInterface__ViewUsers();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#viewExpenses() <em>View Expenses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Expenses</em>' operation.
	 * @see model.AdminInterface#viewExpenses()
	 * @generated
	 */
	EOperation getAdminInterface__ViewExpenses();

	/**
	 * Returns the meta object for the '{@link model.AdminInterface#AdminController(model.RoomExpert, model.ExpenseExpert, model.UserExpert, model.PromotionExpert) <em>Admin Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Admin Controller</em>' operation.
	 * @see model.AdminInterface#AdminController(model.RoomExpert, model.ExpenseExpert, model.UserExpert, model.PromotionExpert)
	 * @generated
	 */
	EOperation getAdminInterface__AdminController__RoomExpert_ExpenseExpert_UserExpert_PromotionExpert();

	/**
	 * Returns the meta object for class '{@link model.Promotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promotion</em>'.
	 * @see model.Promotion
	 * @generated
	 */
	EClass getPromotion();

	/**
	 * Returns the meta object for the attribute '{@link model.Promotion#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see model.Promotion#getCode()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_Code();

	/**
	 * Returns the meta object for the attribute '{@link model.Promotion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see model.Promotion#getDescription()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_Description();

	/**
	 * Returns the meta object for the attribute '{@link model.Promotion#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see model.Promotion#getPercentage()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link model.Promotion#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.Promotion#getID()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.Promotion#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see model.Promotion#getValidFrom()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link model.Promotion#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see model.Promotion#getValidTo()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_ValidTo();

	/**
	 * Returns the meta object for the '{@link model.Promotion#calculateDiscount(model.Room) <em>Calculate Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Discount</em>' operation.
	 * @see model.Promotion#calculateDiscount(model.Room)
	 * @generated
	 */
	EOperation getPromotion__CalculateDiscount__Room();

	/**
	 * Returns the meta object for class '{@link model.RoomExpert <em>Room Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Expert</em>'.
	 * @see model.RoomExpert
	 * @generated
	 */
	EClass getRoomExpert();

	/**
	 * Returns the meta object for the reference '{@link model.RoomExpert#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see model.RoomExpert#getDatabase()
	 * @see #getRoomExpert()
	 * @generated
	 */
	EReference getRoomExpert_Database();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#getAllRooms() <em>Get All Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Rooms</em>' operation.
	 * @see model.RoomExpert#getAllRooms()
	 * @generated
	 */
	EOperation getRoomExpert__GetAllRooms();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#getAvailableRoomTypes(java.util.Date, java.util.Date, int, int) <em>Get Available Room Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Room Types</em>' operation.
	 * @see model.RoomExpert#getAvailableRoomTypes(java.util.Date, java.util.Date, int, int)
	 * @generated
	 */
	EOperation getRoomExpert__GetAvailableRoomTypes__Date_Date_int_int();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#getUnoccupiedRooms() <em>Get Unoccupied Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unoccupied Rooms</em>' operation.
	 * @see model.RoomExpert#getUnoccupiedRooms()
	 * @generated
	 */
	EOperation getRoomExpert__GetUnoccupiedRooms();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#addRoom(model.Room) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see model.RoomExpert#addRoom(model.Room)
	 * @generated
	 */
	EOperation getRoomExpert__AddRoom__Room();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#removeRoom(model.Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see model.RoomExpert#removeRoom(model.Room)
	 * @generated
	 */
	EOperation getRoomExpert__RemoveRoom__Room();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#updateRoom(model.Room) <em>Update Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room</em>' operation.
	 * @see model.RoomExpert#updateRoom(model.Room)
	 * @generated
	 */
	EOperation getRoomExpert__UpdateRoom__Room();

	/**
	 * Returns the meta object for the '{@link model.RoomExpert#getRoom(int) <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see model.RoomExpert#getRoom(int)
	 * @generated
	 */
	EOperation getRoomExpert__GetRoom__int();

	/**
	 * Returns the meta object for class '{@link model.DatabaseInterface <em>Database Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Interface</em>'.
	 * @see model.DatabaseInterface
	 * @generated
	 */
	EClass getDatabaseInterface();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#querystringrowArrayLst() <em>Querystringrow Array Lst</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Querystringrow Array Lst</em>' operation.
	 * @see model.DatabaseInterface#querystringrowArrayLst()
	 * @generated
	 */
	EOperation getDatabaseInterface__QuerystringrowArrayLst();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#updatestringboolean() <em>Updatestringboolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Updatestringboolean</em>' operation.
	 * @see model.DatabaseInterface#updatestringboolean()
	 * @generated
	 */
	EOperation getDatabaseInterface__Updatestringboolean();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#createstringboolean() <em>Createstringboolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Createstringboolean</em>' operation.
	 * @see model.DatabaseInterface#createstringboolean()
	 * @generated
	 */
	EOperation getDatabaseInterface__Createstringboolean();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#removestringboolean() <em>Removestringboolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Removestringboolean</em>' operation.
	 * @see model.DatabaseInterface#removestringboolean()
	 * @generated
	 */
	EOperation getDatabaseInterface__Removestringboolean();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#query(java.lang.String) <em>Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query</em>' operation.
	 * @see model.DatabaseInterface#query(java.lang.String)
	 * @generated
	 */
	EOperation getDatabaseInterface__Query__String();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#update(java.lang.String) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see model.DatabaseInterface#update(java.lang.String)
	 * @generated
	 */
	EOperation getDatabaseInterface__Update__String();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#create(java.lang.String) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see model.DatabaseInterface#create(java.lang.String)
	 * @generated
	 */
	EOperation getDatabaseInterface__Create__String();

	/**
	 * Returns the meta object for the '{@link model.DatabaseInterface#remove(java.lang.String) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see model.DatabaseInterface#remove(java.lang.String)
	 * @generated
	 */
	EOperation getDatabaseInterface__Remove__String();

	/**
	 * Returns the meta object for class '{@link model.ExpenseExpert <em>Expense Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expense Expert</em>'.
	 * @see model.ExpenseExpert
	 * @generated
	 */
	EClass getExpenseExpert();

	/**
	 * Returns the meta object for the reference '{@link model.ExpenseExpert#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see model.ExpenseExpert#getDatabase()
	 * @see #getExpenseExpert()
	 * @generated
	 */
	EReference getExpenseExpert_Database();

	/**
	 * Returns the meta object for the '{@link model.ExpenseExpert#getExpense(int) <em>Get Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Expense</em>' operation.
	 * @see model.ExpenseExpert#getExpense(int)
	 * @generated
	 */
	EOperation getExpenseExpert__GetExpense__int();

	/**
	 * Returns the meta object for the '{@link model.ExpenseExpert#getAllExpense() <em>Get All Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Expense</em>' operation.
	 * @see model.ExpenseExpert#getAllExpense()
	 * @generated
	 */
	EOperation getExpenseExpert__GetAllExpense();

	/**
	 * Returns the meta object for the '{@link model.ExpenseExpert#addExpense(model.Expense) <em>Add Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Expense</em>' operation.
	 * @see model.ExpenseExpert#addExpense(model.Expense)
	 * @generated
	 */
	EOperation getExpenseExpert__AddExpense__Expense();

	/**
	 * Returns the meta object for the '{@link model.ExpenseExpert#removeExpense(int) <em>Remove Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Expense</em>' operation.
	 * @see model.ExpenseExpert#removeExpense(int)
	 * @generated
	 */
	EOperation getExpenseExpert__RemoveExpense__int();

	/**
	 * Returns the meta object for the '{@link model.ExpenseExpert#updateExpense(model.Expense) <em>Update Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Expense</em>' operation.
	 * @see model.ExpenseExpert#updateExpense(model.Expense)
	 * @generated
	 */
	EOperation getExpenseExpert__UpdateExpense__Expense();

	/**
	 * Returns the meta object for class '{@link model.UserExpert <em>User Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Expert</em>'.
	 * @see model.UserExpert
	 * @generated
	 */
	EClass getUserExpert();

	/**
	 * Returns the meta object for the reference '{@link model.UserExpert#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see model.UserExpert#getDatabase()
	 * @see #getUserExpert()
	 * @generated
	 */
	EReference getUserExpert_Database();

	/**
	 * Returns the meta object for the '{@link model.UserExpert#getUser(int) <em>Get User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get User</em>' operation.
	 * @see model.UserExpert#getUser(int)
	 * @generated
	 */
	EOperation getUserExpert__GetUser__int();

	/**
	 * Returns the meta object for the '{@link model.UserExpert#getAllUsers() <em>Get All Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Users</em>' operation.
	 * @see model.UserExpert#getAllUsers()
	 * @generated
	 */
	EOperation getUserExpert__GetAllUsers();

	/**
	 * Returns the meta object for the '{@link model.UserExpert#addUser(model.User) <em>Add User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add User</em>' operation.
	 * @see model.UserExpert#addUser(model.User)
	 * @generated
	 */
	EOperation getUserExpert__AddUser__User();

	/**
	 * Returns the meta object for the '{@link model.UserExpert#removeUser(int) <em>Remove User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove User</em>' operation.
	 * @see model.UserExpert#removeUser(int)
	 * @generated
	 */
	EOperation getUserExpert__RemoveUser__int();

	/**
	 * Returns the meta object for the '{@link model.UserExpert#updateUser(model.User) <em>Update User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update User</em>' operation.
	 * @see model.UserExpert#updateUser(model.User)
	 * @generated
	 */
	EOperation getUserExpert__UpdateUser__User();

	/**
	 * Returns the meta object for the '{@link model.UserExpert#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see model.UserExpert#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getUserExpert__Login__String_String();

	/**
	 * Returns the meta object for class '{@link model.PromotionExpert <em>Promotion Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promotion Expert</em>'.
	 * @see model.PromotionExpert
	 * @generated
	 */
	EClass getPromotionExpert();

	/**
	 * Returns the meta object for the reference '{@link model.PromotionExpert#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see model.PromotionExpert#getDatabase()
	 * @see #getPromotionExpert()
	 * @generated
	 */
	EReference getPromotionExpert_Database();

	/**
	 * Returns the meta object for the '{@link model.PromotionExpert#getPromotion(int) <em>Get Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Promotion</em>' operation.
	 * @see model.PromotionExpert#getPromotion(int)
	 * @generated
	 */
	EOperation getPromotionExpert__GetPromotion__int();

	/**
	 * Returns the meta object for the '{@link model.PromotionExpert#getPromotion(java.lang.String) <em>Get Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Promotion</em>' operation.
	 * @see model.PromotionExpert#getPromotion(java.lang.String)
	 * @generated
	 */
	EOperation getPromotionExpert__GetPromotion__String();

	/**
	 * Returns the meta object for the '{@link model.PromotionExpert#getAllPromotions() <em>Get All Promotions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Promotions</em>' operation.
	 * @see model.PromotionExpert#getAllPromotions()
	 * @generated
	 */
	EOperation getPromotionExpert__GetAllPromotions();

	/**
	 * Returns the meta object for the '{@link model.PromotionExpert#removePromotion(int) <em>Remove Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Promotion</em>' operation.
	 * @see model.PromotionExpert#removePromotion(int)
	 * @generated
	 */
	EOperation getPromotionExpert__RemovePromotion__int();

	/**
	 * Returns the meta object for the '{@link model.PromotionExpert#updatePromotion(model.Promotion) <em>Update Promotion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Promotion</em>' operation.
	 * @see model.PromotionExpert#updatePromotion(model.Promotion)
	 * @generated
	 */
	EOperation getPromotionExpert__UpdatePromotion__Promotion();

	/**
	 * Returns the meta object for class '{@link model.BookingExpert <em>Booking Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Expert</em>'.
	 * @see model.BookingExpert
	 * @generated
	 */
	EClass getBookingExpert();

	/**
	 * Returns the meta object for the reference '{@link model.BookingExpert#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see model.BookingExpert#getDatabase()
	 * @see #getBookingExpert()
	 * @generated
	 */
	EReference getBookingExpert_Database();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see model.BookingExpert#getBooking(int)
	 * @generated
	 */
	EOperation getBookingExpert__GetBooking__int();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#getBooking(java.lang.String) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see model.BookingExpert#getBooking(java.lang.String)
	 * @generated
	 */
	EOperation getBookingExpert__GetBooking__String();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#getAllBooking(java.util.Date, java.util.Date) <em>Get All Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Booking</em>' operation.
	 * @see model.BookingExpert#getAllBooking(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getBookingExpert__GetAllBooking__Date_Date();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#getAllBookings() <em>Get All Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings</em>' operation.
	 * @see model.BookingExpert#getAllBookings()
	 * @generated
	 */
	EOperation getBookingExpert__GetAllBookings();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#addBooking(model.Booking) <em>Add Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking</em>' operation.
	 * @see model.BookingExpert#addBooking(model.Booking)
	 * @generated
	 */
	EOperation getBookingExpert__AddBooking__Booking();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#removeBooking(model.Booking) <em>Remove Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking</em>' operation.
	 * @see model.BookingExpert#removeBooking(model.Booking)
	 * @generated
	 */
	EOperation getBookingExpert__RemoveBooking__Booking();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#updateBooking(model.Booking) <em>Update Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Booking</em>' operation.
	 * @see model.BookingExpert#updateBooking(model.Booking)
	 * @generated
	 */
	EOperation getBookingExpert__UpdateBooking__Booking();

	/**
	 * Returns the meta object for the '{@link model.BookingExpert#getAllBookings(java.lang.String) <em>Get All Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings</em>' operation.
	 * @see model.BookingExpert#getAllBookings(java.lang.String)
	 * @generated
	 */
	EOperation getBookingExpert__GetAllBookings__String();

	/**
	 * Returns the meta object for class '{@link model.ReceiptExpert <em>Receipt Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt Expert</em>'.
	 * @see model.ReceiptExpert
	 * @generated
	 */
	EClass getReceiptExpert();

	/**
	 * Returns the meta object for the reference '{@link model.ReceiptExpert#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see model.ReceiptExpert#getDatabase()
	 * @see #getReceiptExpert()
	 * @generated
	 */
	EReference getReceiptExpert_Database();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#getReceipt(int) <em>Get Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receipt</em>' operation.
	 * @see model.ReceiptExpert#getReceipt(int)
	 * @generated
	 */
	EOperation getReceiptExpert__GetReceipt__int();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#getReceipt(model.Booking) <em>Get Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Receipt</em>' operation.
	 * @see model.ReceiptExpert#getReceipt(model.Booking)
	 * @generated
	 */
	EOperation getReceiptExpert__GetReceipt__Booking();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#getAllReceipt() <em>Get All Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Receipt</em>' operation.
	 * @see model.ReceiptExpert#getAllReceipt()
	 * @generated
	 */
	EOperation getReceiptExpert__GetAllReceipt();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#combine(model.Receipt) <em>Combine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Combine</em>' operation.
	 * @see model.ReceiptExpert#combine(model.Receipt)
	 * @generated
	 */
	EOperation getReceiptExpert__Combine__Receipt();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#addReceipt(model.Receipt) <em>Add Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Receipt</em>' operation.
	 * @see model.ReceiptExpert#addReceipt(model.Receipt)
	 * @generated
	 */
	EOperation getReceiptExpert__AddReceipt__Receipt();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#removeReceipt(model.Receipt) <em>Remove Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Receipt</em>' operation.
	 * @see model.ReceiptExpert#removeReceipt(model.Receipt)
	 * @generated
	 */
	EOperation getReceiptExpert__RemoveReceipt__Receipt();

	/**
	 * Returns the meta object for the '{@link model.ReceiptExpert#updateReceipt(model.Receipt) <em>Update Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Receipt</em>' operation.
	 * @see model.ReceiptExpert#updateReceipt(model.Receipt)
	 * @generated
	 */
	EOperation getReceiptExpert__UpdateReceipt__Receipt();

	/**
	 * Returns the meta object for class '{@link model.email <em>email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>email</em>'.
	 * @see model.email
	 * @generated
	 */
	EClass getemail();

	/**
	 * Returns the meta object for the '{@link model.email#send(model.Booking) <em>Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send</em>' operation.
	 * @see model.email#send(model.Booking)
	 * @generated
	 */
	EOperation getemail__Send__Booking();

	/**
	 * Returns the meta object for class '{@link model.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see model.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the '{@link model.Payment#makePayment(model.Customer, int) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see model.Payment#makePayment(model.Customer, int)
	 * @generated
	 */
	EOperation getPayment__MakePayment__Customer_int();

	/**
	 * Returns the meta object for the '{@link model.Payment#isCreditCardValidcustomerBool() <em>Is Credit Card Validcustomer Bool</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Validcustomer Bool</em>' operation.
	 * @see model.Payment#isCreditCardValidcustomerBool()
	 * @generated
	 */
	EOperation getPayment__IsCreditCardValidcustomerBool();

	/**
	 * Returns the meta object for class '{@link model.BookingController <em>Booking Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Controller</em>'.
	 * @see model.BookingController
	 * @generated
	 */
	EClass getBookingController();

	/**
	 * Returns the meta object for the reference '{@link model.BookingController#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see model.BookingController#getRoom()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_Room();

	/**
	 * Returns the meta object for the reference '{@link model.BookingController#getBookingExpert <em>Booking Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking Expert</em>'.
	 * @see model.BookingController#getBookingExpert()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_BookingExpert();

	/**
	 * Returns the meta object for the reference '{@link model.BookingController#getPromotionExpert <em>Promotion Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promotion Expert</em>'.
	 * @see model.BookingController#getPromotionExpert()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_PromotionExpert();

	/**
	 * Returns the meta object for the reference '{@link model.BookingController#getDatabaseInterface <em>Database Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database Interface</em>'.
	 * @see model.BookingController#getDatabaseInterface()
	 * @see #getBookingController()
	 * @generated
	 */
	EReference getBookingController_DatabaseInterface();

	/**
	 * Returns the meta object for class '{@link model.AdminController <em>Admin Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Controller</em>'.
	 * @see model.AdminController
	 * @generated
	 */
	EClass getAdminController();

	/**
	 * Returns the meta object for the reference '{@link model.AdminController#getUserExpert <em>User Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Expert</em>'.
	 * @see model.AdminController#getUserExpert()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_UserExpert();

	/**
	 * Returns the meta object for the reference '{@link model.AdminController#getExpenseExpert <em>Expense Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expense Expert</em>'.
	 * @see model.AdminController#getExpenseExpert()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_ExpenseExpert();

	/**
	 * Returns the meta object for the reference '{@link model.AdminController#getPromoExpert <em>Promo Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Promo Expert</em>'.
	 * @see model.AdminController#getPromoExpert()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_PromoExpert();

	/**
	 * Returns the meta object for the reference '{@link model.AdminController#getDatabaseInterface <em>Database Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database Interface</em>'.
	 * @see model.AdminController#getDatabaseInterface()
	 * @see #getAdminController()
	 * @generated
	 */
	EReference getAdminController_DatabaseInterface();

	/**
	 * Returns the meta object for class '{@link model.ReceptionistController <em>Receptionist Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receptionist Controller</em>'.
	 * @see model.ReceptionistController
	 * @generated
	 */
	EClass getReceptionistController();

	/**
	 * Returns the meta object for the reference '{@link model.ReceptionistController#getExpenseExpert <em>Expense Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expense Expert</em>'.
	 * @see model.ReceptionistController#getExpenseExpert()
	 * @see #getReceptionistController()
	 * @generated
	 */
	EReference getReceptionistController_ExpenseExpert();

	/**
	 * Returns the meta object for the reference '{@link model.ReceptionistController#getRoomExpert <em>Room Expert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Expert</em>'.
	 * @see model.ReceptionistController#getRoomExpert()
	 * @see #getReceptionistController()
	 * @generated
	 */
	EReference getReceptionistController_RoomExpert();

	/**
	 * Returns the meta object for class '{@link model.MSAccessDB <em>MS Access DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MS Access DB</em>'.
	 * @see model.MSAccessDB
	 * @generated
	 */
	EClass getMSAccessDB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.BankComponentImpl <em>Bank Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BankComponentImpl
		 * @see model.impl.ModelPackageImpl#getBankComponent()
		 * @generated
		 */
		EClass BANK_COMPONENT = eINSTANCE.getBankComponent();

		/**
		 * The meta object literal for the '{@link model.impl.HotelComponentImpl <em>Hotel Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.HotelComponentImpl
		 * @see model.impl.ModelPackageImpl#getHotelComponent()
		 * @generated
		 */
		EClass HOTEL_COMPONENT = eINSTANCE.getHotelComponent();

		/**
		 * The meta object literal for the '{@link model.impl.ReceptionistImpl <em>Receptionist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ReceptionistImpl
		 * @see model.impl.ModelPackageImpl#getReceptionist()
		 * @generated
		 */
		EClass RECEPTIONIST = eINSTANCE.getReceptionist();

		/**
		 * The meta object literal for the '{@link model.impl.CustomersImpl <em>Customers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CustomersImpl
		 * @see model.impl.ModelPackageImpl#getCustomers()
		 * @generated
		 */
		EClass CUSTOMERS = eINSTANCE.getCustomers();

		/**
		 * The meta object literal for the '{@link model.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AdminImpl
		 * @see model.impl.ModelPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '{@link model.BankInterface <em>Bank Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BankInterface
		 * @see model.impl.ModelPackageImpl#getBankInterface()
		 * @generated
		 */
		EClass BANK_INTERFACE = eINSTANCE.getBankInterface();

		/**
		 * The meta object literal for the '{@link model.CustomerInterface <em>Customer Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.CustomerInterface
		 * @see model.impl.ModelPackageImpl#getCustomerInterface()
		 * @generated
		 */
		EClass CUSTOMER_INTERFACE = eINSTANCE.getCustomerInterface();

		/**
		 * The meta object literal for the '<em><b>Search Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_INTERFACE___SEARCH_ROOMS__DATE_DATE_INT_INT = eINSTANCE.getCustomerInterface__SearchRooms__Date_Date_int_int();

		/**
		 * The meta object literal for the '<em><b>Search Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_INTERFACE___SEARCH_ROOMS__DATE_DATE = eINSTANCE.getCustomerInterface__SearchRooms__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Create Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_INTERFACE___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_STRING_STRING_INT_INT = eINSTANCE.getCustomerInterface__CreateCustomer__String_String_String_String_String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_INTERFACE___PAY__CUSTOMER_RECEIPT = eINSTANCE.getCustomerInterface__Pay__Customer_Receipt();

		/**
		 * The meta object literal for the '<em><b>Validate Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_INTERFACE___VALIDATE_CARD__STRING_STRING_INT_INT = eINSTANCE.getCustomerInterface__ValidateCard__String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_INTERFACE___CREATE_BOOKING__DATE_DATE_STRING_CUSTOMER_STRING_RECEIPT_STRING = eINSTANCE.getCustomerInterface__CreateBooking__Date_Date_String_Customer_String_Receipt_String();

		/**
		 * The meta object literal for the '{@link model.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RoomImpl
		 * @see model.impl.ModelPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__EXPENSE = eINSTANCE.getRoom_Expense();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__DESCRIPTION = eINSTANCE.getRoom_Description();

		/**
		 * The meta object literal for the '<em><b>Clean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CLEAN = eINSTANCE.getRoom_Clean();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__TYPE = eINSTANCE.getRoom_Type();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__PRICE = eINSTANCE.getRoom_Price();

		/**
		 * The meta object literal for the '<em><b>Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__BEDS = eINSTANCE.getRoom_Beds();

		/**
		 * The meta object literal for the '<em><b>Receipt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__RECEIPT = eINSTANCE.getRoom_Receipt();

		/**
		 * The meta object literal for the '<em><b>Resident</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__RESIDENT = eINSTANCE.getRoom_Resident();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___ROOM__INT_STRING_STRING_INT_INT = eINSTANCE.getRoom__Room__int_String_String_int_int();

		/**
		 * The meta object literal for the '{@link model.impl.ExpenseImpl <em>Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExpenseImpl
		 * @see model.impl.ModelPackageImpl#getExpense()
		 * @generated
		 */
		EClass EXPENSE = eINSTANCE.getExpense();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__PRICE = eINSTANCE.getExpense_Price();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__NAME = eINSTANCE.getExpense_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__DESCRIPTION = eINSTANCE.getExpense_Description();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__DATE = eINSTANCE.getExpense_Date();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__ID = eINSTANCE.getExpense_ID();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPENSE___EXPENSE__INT_STRING_STRING_DATE = eINSTANCE.getExpense__Expense__int_String_String_Date();

		/**
		 * The meta object literal for the '{@link model.impl.ReceiptImpl <em>Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ReceiptImpl
		 * @see model.impl.ModelPackageImpl#getReceipt()
		 * @generated
		 */
		EClass RECEIPT = eINSTANCE.getReceipt();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__EXPENSE = eINSTANCE.getReceipt_Expense();

		/**
		 * The meta object literal for the '<em><b>Total Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__TOTAL_COST = eINSTANCE.getReceipt_TotalCost();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__DATE = eINSTANCE.getReceipt_Date();

		/**
		 * The meta object literal for the '<em><b>Expenses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__EXPENSES = eINSTANCE.getReceipt_Expenses();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__ID = eINSTANCE.getReceipt_ID();

		/**
		 * The meta object literal for the '<em><b>Cashier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__CASHIER = eINSTANCE.getReceipt_Cashier();

		/**
		 * The meta object literal for the '<em><b>Add Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT___ADD_EXPENSE__EXPENSE = eINSTANCE.getReceipt__AddExpense__Expense();

		/**
		 * The meta object literal for the '<em><b>Remove Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT___REMOVE_EXPENSE__EXPENSE = eINSTANCE.getReceipt__RemoveExpense__Expense();

		/**
		 * The meta object literal for the '<em><b>Get All Expenses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT___GET_ALL_EXPENSES = eINSTANCE.getReceipt__GetAllExpenses();

		/**
		 * The meta object literal for the '{@link model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.UserImpl
		 * @see model.impl.ModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SURNAME = eINSTANCE.getUser_Surname();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_ID();

		/**
		 * The meta object literal for the '<em><b>Receptionist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__RECEPTIONIST = eINSTANCE.getUser_Receptionist();

		/**
		 * The meta object literal for the '<em><b>Administrator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ADMINISTRATOR = eINSTANCE.getUser_Administrator();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getUser__User__String_String_String_boolean_boolean();

		/**
		 * The meta object literal for the '{@link model.impl.ResidentImpl <em>Resident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ResidentImpl
		 * @see model.impl.ModelPackageImpl#getResident()
		 * @generated
		 */
		EClass RESIDENT = eINSTANCE.getResident();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDENT__FIRST_NAME = eINSTANCE.getResident_FirstName();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDENT__SURNAME = eINSTANCE.getResident_Surname();

		/**
		 * The meta object literal for the '<em><b>Passport Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESIDENT__PASSPORT_NUMBER = eINSTANCE.getResident_PassportNumber();

		/**
		 * The meta object literal for the '<em><b>Resident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESIDENT___RESIDENT__STRING_STRING_STRING = eINSTANCE.getResident__Resident__String_String_String();

		/**
		 * The meta object literal for the '{@link model.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CustomerImpl
		 * @see model.impl.ModelPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SURNAME = eINSTANCE.getCustomer_Surname();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADRESS = eINSTANCE.getCustomer_Adress();

		/**
		 * The meta object literal for the '<em><b>Cc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CC_NUMBER = eINSTANCE.getCustomer_CcNumber();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CCV = eINSTANCE.getCustomer_Ccv();

		/**
		 * The meta object literal for the '<em><b>Expiring Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EXPIRING_MONTH = eINSTANCE.getCustomer_ExpiringMonth();

		/**
		 * The meta object literal for the '<em><b>Expiring Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EXPIRING_YEAR = eINSTANCE.getCustomer_ExpiringYear();

		/**
		 * The meta object literal for the '{@link model.ReceptionistInterface <em>Receptionist Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ReceptionistInterface
		 * @see model.impl.ModelPackageImpl#getReceptionistInterface()
		 * @generated
		 */
		EClass RECEPTIONIST_INTERFACE = eINSTANCE.getReceptionistInterface();

		/**
		 * The meta object literal for the '<em><b>Create Resident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___CREATE_RESIDENT__STRING_STRING_STRING = eINSTANCE.getReceptionistInterface__CreateResident__String_String_String();

		/**
		 * The meta object literal for the '<em><b>View All Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___VIEW_ALL_BOOKINGS__DATE_DATE = eINSTANCE.getReceptionistInterface__ViewAllBookings__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___GET_BOOKING__STRING = eINSTANCE.getReceptionistInterface__GetBooking__String();

		/**
		 * The meta object literal for the '<em><b>View Un Occupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS = eINSTANCE.getReceptionistInterface__ViewUnOccupiedRooms();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___GET_BOOKING__STRING_DATE_DATE = eINSTANCE.getReceptionistInterface__GetBooking__String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>View Un Occupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___VIEW_UN_OCCUPIED_ROOMS__STRING = eINSTANCE.getReceptionistInterface__ViewUnOccupiedRooms__String();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___CHECK_IN__BOOKING = eINSTANCE.getReceptionistInterface__CheckIn__Booking();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPTIONIST_INTERFACE___CHECK_OUT__BOOKING = eINSTANCE.getReceptionistInterface__CheckOut__Booking();

		/**
		 * The meta object literal for the '{@link model.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BookingImpl
		 * @see model.impl.ModelPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__FROM_DATE = eINSTANCE.getBooking_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__TO_DATE = eINSTANCE.getBooking_ToDate();

		/**
		 * The meta object literal for the '<em><b>Wishes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__WISHES = eINSTANCE.getBooking_Wishes();

		/**
		 * The meta object literal for the '<em><b>Promotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__PROMOTION = eINSTANCE.getBooking_Promotion();

		/**
		 * The meta object literal for the '<em><b>Room Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ROOM_TYPES = eINSTANCE.getBooking_RoomTypes();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECKED_IN = eINSTANCE.getBooking_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___BOOKING__STRING_DATE_DATE_STRING_CUSTOMER_ELIST_STRING = eINSTANCE.getBooking__Booking__String_Date_Date_String_Customer_EList_String();

		/**
		 * The meta object literal for the '{@link model.AdminInterface <em>Admin Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.AdminInterface
		 * @see model.impl.ModelPackageImpl#getAdminInterface()
		 * @generated
		 */
		EClass ADMIN_INTERFACE = eINSTANCE.getAdminInterface();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___LOGIN__STRING_STRING = eINSTANCE.getAdminInterface__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___CREATE_ROOM__INT_STRING_STRING_INT_INT = eINSTANCE.getAdminInterface__CreateRoom__int_String_String_int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___REMOVE_ROOM__ROOM = eINSTANCE.getAdminInterface__RemoveRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Update Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___UPDATE_ROOM__ROOM = eINSTANCE.getAdminInterface__UpdateRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Create User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___CREATE_USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN = eINSTANCE.getAdminInterface__CreateUser__String_String_String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___REMOVE_USER__USER = eINSTANCE.getAdminInterface__RemoveUser__User();

		/**
		 * The meta object literal for the '<em><b>Update User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___UPDATE_USER__USER = eINSTANCE.getAdminInterface__UpdateUser__User();

		/**
		 * The meta object literal for the '<em><b>Create Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___CREATE_PROMOTION__STRING_STRING_INT_DATE = eINSTANCE.getAdminInterface__CreatePromotion__String_String_int_Date();

		/**
		 * The meta object literal for the '<em><b>Remove Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___REMOVE_PROMOTION__PROMOTION = eINSTANCE.getAdminInterface__RemovePromotion__Promotion();

		/**
		 * The meta object literal for the '<em><b>Update Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___UPDATE_PROMOTION__PROMOTION = eINSTANCE.getAdminInterface__UpdatePromotion__Promotion();

		/**
		 * The meta object literal for the '<em><b>Create Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___CREATE_EXPENSE__INT_STRING_STRING_DATE_BOOLEAN = eINSTANCE.getAdminInterface__CreateExpense__int_String_String_Date_boolean();

		/**
		 * The meta object literal for the '<em><b>Remove Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___REMOVE_EXPENSE__EXPENSE = eINSTANCE.getAdminInterface__RemoveExpense__Expense();

		/**
		 * The meta object literal for the '<em><b>Update Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___UPDATE_EXPENSE__EXPENSE = eINSTANCE.getAdminInterface__UpdateExpense__Expense();

		/**
		 * The meta object literal for the '<em><b>View Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___VIEW_ROOMS = eINSTANCE.getAdminInterface__ViewRooms();

		/**
		 * The meta object literal for the '<em><b>View Promotions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___VIEW_PROMOTIONS = eINSTANCE.getAdminInterface__ViewPromotions();

		/**
		 * The meta object literal for the '<em><b>View Users</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___VIEW_USERS = eINSTANCE.getAdminInterface__ViewUsers();

		/**
		 * The meta object literal for the '<em><b>View Expenses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___VIEW_EXPENSES = eINSTANCE.getAdminInterface__ViewExpenses();

		/**
		 * The meta object literal for the '<em><b>Admin Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN_INTERFACE___ADMIN_CONTROLLER__ROOMEXPERT_EXPENSEEXPERT_USEREXPERT_PROMOTIONEXPERT = eINSTANCE.getAdminInterface__AdminController__RoomExpert_ExpenseExpert_UserExpert_PromotionExpert();

		/**
		 * The meta object literal for the '{@link model.impl.PromotionImpl <em>Promotion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PromotionImpl
		 * @see model.impl.ModelPackageImpl#getPromotion()
		 * @generated
		 */
		EClass PROMOTION = eINSTANCE.getPromotion();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__CODE = eINSTANCE.getPromotion_Code();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__DESCRIPTION = eINSTANCE.getPromotion_Description();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__PERCENTAGE = eINSTANCE.getPromotion_Percentage();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__ID = eINSTANCE.getPromotion_ID();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__VALID_FROM = eINSTANCE.getPromotion_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__VALID_TO = eINSTANCE.getPromotion_ValidTo();

		/**
		 * The meta object literal for the '<em><b>Calculate Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION___CALCULATE_DISCOUNT__ROOM = eINSTANCE.getPromotion__CalculateDiscount__Room();

		/**
		 * The meta object literal for the '{@link model.impl.RoomExpertImpl <em>Room Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RoomExpertImpl
		 * @see model.impl.ModelPackageImpl#getRoomExpert()
		 * @generated
		 */
		EClass ROOM_EXPERT = eINSTANCE.getRoomExpert();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_EXPERT__DATABASE = eINSTANCE.getRoomExpert_Database();

		/**
		 * The meta object literal for the '<em><b>Get All Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___GET_ALL_ROOMS = eINSTANCE.getRoomExpert__GetAllRooms();

		/**
		 * The meta object literal for the '<em><b>Get Available Room Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___GET_AVAILABLE_ROOM_TYPES__DATE_DATE_INT_INT = eINSTANCE.getRoomExpert__GetAvailableRoomTypes__Date_Date_int_int();

		/**
		 * The meta object literal for the '<em><b>Get Unoccupied Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___GET_UNOCCUPIED_ROOMS = eINSTANCE.getRoomExpert__GetUnoccupiedRooms();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___ADD_ROOM__ROOM = eINSTANCE.getRoomExpert__AddRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___REMOVE_ROOM__ROOM = eINSTANCE.getRoomExpert__RemoveRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Update Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___UPDATE_ROOM__ROOM = eINSTANCE.getRoomExpert__UpdateRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_EXPERT___GET_ROOM__INT = eINSTANCE.getRoomExpert__GetRoom__int();

		/**
		 * The meta object literal for the '{@link model.DatabaseInterface <em>Database Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.DatabaseInterface
		 * @see model.impl.ModelPackageImpl#getDatabaseInterface()
		 * @generated
		 */
		EClass DATABASE_INTERFACE = eINSTANCE.getDatabaseInterface();

		/**
		 * The meta object literal for the '<em><b>Querystringrow Array Lst</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___QUERYSTRINGROW_ARRAY_LST = eINSTANCE.getDatabaseInterface__QuerystringrowArrayLst();

		/**
		 * The meta object literal for the '<em><b>Updatestringboolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___UPDATESTRINGBOOLEAN = eINSTANCE.getDatabaseInterface__Updatestringboolean();

		/**
		 * The meta object literal for the '<em><b>Createstringboolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___CREATESTRINGBOOLEAN = eINSTANCE.getDatabaseInterface__Createstringboolean();

		/**
		 * The meta object literal for the '<em><b>Removestringboolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___REMOVESTRINGBOOLEAN = eINSTANCE.getDatabaseInterface__Removestringboolean();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___QUERY__STRING = eINSTANCE.getDatabaseInterface__Query__String();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___UPDATE__STRING = eINSTANCE.getDatabaseInterface__Update__String();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___CREATE__STRING = eINSTANCE.getDatabaseInterface__Create__String();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_INTERFACE___REMOVE__STRING = eINSTANCE.getDatabaseInterface__Remove__String();

		/**
		 * The meta object literal for the '{@link model.impl.ExpenseExpertImpl <em>Expense Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExpenseExpertImpl
		 * @see model.impl.ModelPackageImpl#getExpenseExpert()
		 * @generated
		 */
		EClass EXPENSE_EXPERT = eINSTANCE.getExpenseExpert();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPENSE_EXPERT__DATABASE = eINSTANCE.getExpenseExpert_Database();

		/**
		 * The meta object literal for the '<em><b>Get Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPENSE_EXPERT___GET_EXPENSE__INT = eINSTANCE.getExpenseExpert__GetExpense__int();

		/**
		 * The meta object literal for the '<em><b>Get All Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPENSE_EXPERT___GET_ALL_EXPENSE = eINSTANCE.getExpenseExpert__GetAllExpense();

		/**
		 * The meta object literal for the '<em><b>Add Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPENSE_EXPERT___ADD_EXPENSE__EXPENSE = eINSTANCE.getExpenseExpert__AddExpense__Expense();

		/**
		 * The meta object literal for the '<em><b>Remove Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPENSE_EXPERT___REMOVE_EXPENSE__INT = eINSTANCE.getExpenseExpert__RemoveExpense__int();

		/**
		 * The meta object literal for the '<em><b>Update Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXPENSE_EXPERT___UPDATE_EXPENSE__EXPENSE = eINSTANCE.getExpenseExpert__UpdateExpense__Expense();

		/**
		 * The meta object literal for the '{@link model.impl.UserExpertImpl <em>User Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.UserExpertImpl
		 * @see model.impl.ModelPackageImpl#getUserExpert()
		 * @generated
		 */
		EClass USER_EXPERT = eINSTANCE.getUserExpert();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_EXPERT__DATABASE = eINSTANCE.getUserExpert_Database();

		/**
		 * The meta object literal for the '<em><b>Get User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_EXPERT___GET_USER__INT = eINSTANCE.getUserExpert__GetUser__int();

		/**
		 * The meta object literal for the '<em><b>Get All Users</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_EXPERT___GET_ALL_USERS = eINSTANCE.getUserExpert__GetAllUsers();

		/**
		 * The meta object literal for the '<em><b>Add User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_EXPERT___ADD_USER__USER = eINSTANCE.getUserExpert__AddUser__User();

		/**
		 * The meta object literal for the '<em><b>Remove User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_EXPERT___REMOVE_USER__INT = eINSTANCE.getUserExpert__RemoveUser__int();

		/**
		 * The meta object literal for the '<em><b>Update User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_EXPERT___UPDATE_USER__USER = eINSTANCE.getUserExpert__UpdateUser__User();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_EXPERT___LOGIN__STRING_STRING = eINSTANCE.getUserExpert__Login__String_String();

		/**
		 * The meta object literal for the '{@link model.impl.PromotionExpertImpl <em>Promotion Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PromotionExpertImpl
		 * @see model.impl.ModelPackageImpl#getPromotionExpert()
		 * @generated
		 */
		EClass PROMOTION_EXPERT = eINSTANCE.getPromotionExpert();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMOTION_EXPERT__DATABASE = eINSTANCE.getPromotionExpert_Database();

		/**
		 * The meta object literal for the '<em><b>Get Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION_EXPERT___GET_PROMOTION__INT = eINSTANCE.getPromotionExpert__GetPromotion__int();

		/**
		 * The meta object literal for the '<em><b>Get Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION_EXPERT___GET_PROMOTION__STRING = eINSTANCE.getPromotionExpert__GetPromotion__String();

		/**
		 * The meta object literal for the '<em><b>Get All Promotions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION_EXPERT___GET_ALL_PROMOTIONS = eINSTANCE.getPromotionExpert__GetAllPromotions();

		/**
		 * The meta object literal for the '<em><b>Remove Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION_EXPERT___REMOVE_PROMOTION__INT = eINSTANCE.getPromotionExpert__RemovePromotion__int();

		/**
		 * The meta object literal for the '<em><b>Update Promotion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION_EXPERT___UPDATE_PROMOTION__PROMOTION = eINSTANCE.getPromotionExpert__UpdatePromotion__Promotion();

		/**
		 * The meta object literal for the '{@link model.impl.BookingExpertImpl <em>Booking Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BookingExpertImpl
		 * @see model.impl.ModelPackageImpl#getBookingExpert()
		 * @generated
		 */
		EClass BOOKING_EXPERT = eINSTANCE.getBookingExpert();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_EXPERT__DATABASE = eINSTANCE.getBookingExpert_Database();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___GET_BOOKING__INT = eINSTANCE.getBookingExpert__GetBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___GET_BOOKING__STRING = eINSTANCE.getBookingExpert__GetBooking__String();

		/**
		 * The meta object literal for the '<em><b>Get All Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___GET_ALL_BOOKING__DATE_DATE = eINSTANCE.getBookingExpert__GetAllBooking__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get All Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___GET_ALL_BOOKINGS = eINSTANCE.getBookingExpert__GetAllBookings();

		/**
		 * The meta object literal for the '<em><b>Add Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___ADD_BOOKING__BOOKING = eINSTANCE.getBookingExpert__AddBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Remove Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___REMOVE_BOOKING__BOOKING = eINSTANCE.getBookingExpert__RemoveBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Update Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___UPDATE_BOOKING__BOOKING = eINSTANCE.getBookingExpert__UpdateBooking__Booking();

		/**
		 * The meta object literal for the '<em><b>Get All Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_EXPERT___GET_ALL_BOOKINGS__STRING = eINSTANCE.getBookingExpert__GetAllBookings__String();

		/**
		 * The meta object literal for the '{@link model.impl.ReceiptExpertImpl <em>Receipt Expert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ReceiptExpertImpl
		 * @see model.impl.ModelPackageImpl#getReceiptExpert()
		 * @generated
		 */
		EClass RECEIPT_EXPERT = eINSTANCE.getReceiptExpert();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT_EXPERT__DATABASE = eINSTANCE.getReceiptExpert_Database();

		/**
		 * The meta object literal for the '<em><b>Get Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___GET_RECEIPT__INT = eINSTANCE.getReceiptExpert__GetReceipt__int();

		/**
		 * The meta object literal for the '<em><b>Get Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___GET_RECEIPT__BOOKING = eINSTANCE.getReceiptExpert__GetReceipt__Booking();

		/**
		 * The meta object literal for the '<em><b>Get All Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___GET_ALL_RECEIPT = eINSTANCE.getReceiptExpert__GetAllReceipt();

		/**
		 * The meta object literal for the '<em><b>Combine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___COMBINE__RECEIPT = eINSTANCE.getReceiptExpert__Combine__Receipt();

		/**
		 * The meta object literal for the '<em><b>Add Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___ADD_RECEIPT__RECEIPT = eINSTANCE.getReceiptExpert__AddReceipt__Receipt();

		/**
		 * The meta object literal for the '<em><b>Remove Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___REMOVE_RECEIPT__RECEIPT = eINSTANCE.getReceiptExpert__RemoveReceipt__Receipt();

		/**
		 * The meta object literal for the '<em><b>Update Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT_EXPERT___UPDATE_RECEIPT__RECEIPT = eINSTANCE.getReceiptExpert__UpdateReceipt__Receipt();

		/**
		 * The meta object literal for the '{@link model.impl.emailImpl <em>email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.emailImpl
		 * @see model.impl.ModelPackageImpl#getemail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getemail();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMAIL___SEND__BOOKING = eINSTANCE.getemail__Send__Booking();

		/**
		 * The meta object literal for the '{@link model.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PaymentImpl
		 * @see model.impl.ModelPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___MAKE_PAYMENT__CUSTOMER_INT = eINSTANCE.getPayment__MakePayment__Customer_int();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Validcustomer Bool</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___IS_CREDIT_CARD_VALIDCUSTOMER_BOOL = eINSTANCE.getPayment__IsCreditCardValidcustomerBool();

		/**
		 * The meta object literal for the '{@link model.impl.BookingControllerImpl <em>Booking Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BookingControllerImpl
		 * @see model.impl.ModelPackageImpl#getBookingController()
		 * @generated
		 */
		EClass BOOKING_CONTROLLER = eINSTANCE.getBookingController();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__ROOM = eINSTANCE.getBookingController_Room();

		/**
		 * The meta object literal for the '<em><b>Booking Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__BOOKING_EXPERT = eINSTANCE.getBookingController_BookingExpert();

		/**
		 * The meta object literal for the '<em><b>Promotion Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__PROMOTION_EXPERT = eINSTANCE.getBookingController_PromotionExpert();

		/**
		 * The meta object literal for the '<em><b>Database Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_CONTROLLER__DATABASE_INTERFACE = eINSTANCE.getBookingController_DatabaseInterface();

		/**
		 * The meta object literal for the '{@link model.impl.AdminControllerImpl <em>Admin Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AdminControllerImpl
		 * @see model.impl.ModelPackageImpl#getAdminController()
		 * @generated
		 */
		EClass ADMIN_CONTROLLER = eINSTANCE.getAdminController();

		/**
		 * The meta object literal for the '<em><b>User Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__USER_EXPERT = eINSTANCE.getAdminController_UserExpert();

		/**
		 * The meta object literal for the '<em><b>Expense Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__EXPENSE_EXPERT = eINSTANCE.getAdminController_ExpenseExpert();

		/**
		 * The meta object literal for the '<em><b>Promo Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__PROMO_EXPERT = eINSTANCE.getAdminController_PromoExpert();

		/**
		 * The meta object literal for the '<em><b>Database Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONTROLLER__DATABASE_INTERFACE = eINSTANCE.getAdminController_DatabaseInterface();

		/**
		 * The meta object literal for the '{@link model.impl.ReceptionistControllerImpl <em>Receptionist Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ReceptionistControllerImpl
		 * @see model.impl.ModelPackageImpl#getReceptionistController()
		 * @generated
		 */
		EClass RECEPTIONIST_CONTROLLER = eINSTANCE.getReceptionistController();

		/**
		 * The meta object literal for the '<em><b>Expense Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTIONIST_CONTROLLER__EXPENSE_EXPERT = eINSTANCE.getReceptionistController_ExpenseExpert();

		/**
		 * The meta object literal for the '<em><b>Room Expert</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEPTIONIST_CONTROLLER__ROOM_EXPERT = eINSTANCE.getReceptionistController_RoomExpert();

		/**
		 * The meta object literal for the '{@link model.impl.MSAccessDBImpl <em>MS Access DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MSAccessDBImpl
		 * @see model.impl.ModelPackageImpl#getMSAccessDB()
		 * @generated
		 */
		EClass MS_ACCESS_DB = eINSTANCE.getMSAccessDB();

	}

} //ModelPackage