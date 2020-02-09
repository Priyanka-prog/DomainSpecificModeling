/**
 */
package myShoppingMall.impl;

import java.util.Date;

import myShoppingMall.Employee;
import myShoppingMall.MyShoppingMallPackage;
import myShoppingMall.Schedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getEmployeeName <em>Employee Name</em>}</li>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getID <em>ID</em>}</li>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getFiscalCode <em>Fiscal Code</em>}</li>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getShifts <em>Shifts</em>}</li>
 *   <li>{@link myShoppingMall.impl.EmployeeImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The default value of the '{@link #getEmployeeName() <em>Employee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeName() <em>Employee Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeName()
	 * @generated
	 * @ordered
	 */
	protected String employeeName = EMPLOYEE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignation() <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignation()
	 * @generated
	 * @ordered
	 */
	protected String designation = DESIGNATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiscalCode() <em>Fiscal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String FISCAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiscalCode() <em>Fiscal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalCode()
	 * @generated
	 * @ordered
	 */
	protected String fiscalCode = FISCAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShifts() <em>Shifts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShifts()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIFTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShifts() <em>Shifts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShifts()
	 * @generated
	 * @ordered
	 */
	protected String shifts = SHIFTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Schedule schedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyShoppingMallPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeName(String newEmployeeName) {
		String oldEmployeeName = employeeName;
		employeeName = newEmployeeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__EMPLOYEE_NAME, oldEmployeeName, employeeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(Date newDateOfBirth) {
		Date oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignation(String newDesignation) {
		String oldDesignation = designation;
		designation = newDesignation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__DESIGNATION, oldDesignation, designation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiscalCode() {
		return fiscalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalCode(String newFiscalCode) {
		String oldFiscalCode = fiscalCode;
		fiscalCode = newFiscalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__FISCAL_CODE, oldFiscalCode, fiscalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShifts() {
		return shifts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShifts(String newShifts) {
		String oldShifts = shifts;
		shifts = newShifts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__SHIFTS, oldShifts, shifts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		Schedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.EMPLOYEE__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyShoppingMallPackage.EMPLOYEE__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyShoppingMallPackage.EMPLOYEE__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyShoppingMallPackage.EMPLOYEE__SCHEDULE:
				return basicSetSchedule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyShoppingMallPackage.EMPLOYEE__EMPLOYEE_NAME:
				return getEmployeeName();
			case MyShoppingMallPackage.EMPLOYEE__ID:
				return getID();
			case MyShoppingMallPackage.EMPLOYEE__DATE_OF_BIRTH:
				return getDateOfBirth();
			case MyShoppingMallPackage.EMPLOYEE__DESIGNATION:
				return getDesignation();
			case MyShoppingMallPackage.EMPLOYEE__FISCAL_CODE:
				return getFiscalCode();
			case MyShoppingMallPackage.EMPLOYEE__SHIFTS:
				return getShifts();
			case MyShoppingMallPackage.EMPLOYEE__SCHEDULE:
				return getSchedule();
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
			case MyShoppingMallPackage.EMPLOYEE__EMPLOYEE_NAME:
				setEmployeeName((String)newValue);
				return;
			case MyShoppingMallPackage.EMPLOYEE__ID:
				setID((Integer)newValue);
				return;
			case MyShoppingMallPackage.EMPLOYEE__DATE_OF_BIRTH:
				setDateOfBirth((Date)newValue);
				return;
			case MyShoppingMallPackage.EMPLOYEE__DESIGNATION:
				setDesignation((String)newValue);
				return;
			case MyShoppingMallPackage.EMPLOYEE__FISCAL_CODE:
				setFiscalCode((String)newValue);
				return;
			case MyShoppingMallPackage.EMPLOYEE__SHIFTS:
				setShifts((String)newValue);
				return;
			case MyShoppingMallPackage.EMPLOYEE__SCHEDULE:
				setSchedule((Schedule)newValue);
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
			case MyShoppingMallPackage.EMPLOYEE__EMPLOYEE_NAME:
				setEmployeeName(EMPLOYEE_NAME_EDEFAULT);
				return;
			case MyShoppingMallPackage.EMPLOYEE__ID:
				setID(ID_EDEFAULT);
				return;
			case MyShoppingMallPackage.EMPLOYEE__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case MyShoppingMallPackage.EMPLOYEE__DESIGNATION:
				setDesignation(DESIGNATION_EDEFAULT);
				return;
			case MyShoppingMallPackage.EMPLOYEE__FISCAL_CODE:
				setFiscalCode(FISCAL_CODE_EDEFAULT);
				return;
			case MyShoppingMallPackage.EMPLOYEE__SHIFTS:
				setShifts(SHIFTS_EDEFAULT);
				return;
			case MyShoppingMallPackage.EMPLOYEE__SCHEDULE:
				setSchedule((Schedule)null);
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
			case MyShoppingMallPackage.EMPLOYEE__EMPLOYEE_NAME:
				return EMPLOYEE_NAME_EDEFAULT == null ? employeeName != null : !EMPLOYEE_NAME_EDEFAULT.equals(employeeName);
			case MyShoppingMallPackage.EMPLOYEE__ID:
				return id != ID_EDEFAULT;
			case MyShoppingMallPackage.EMPLOYEE__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case MyShoppingMallPackage.EMPLOYEE__DESIGNATION:
				return DESIGNATION_EDEFAULT == null ? designation != null : !DESIGNATION_EDEFAULT.equals(designation);
			case MyShoppingMallPackage.EMPLOYEE__FISCAL_CODE:
				return FISCAL_CODE_EDEFAULT == null ? fiscalCode != null : !FISCAL_CODE_EDEFAULT.equals(fiscalCode);
			case MyShoppingMallPackage.EMPLOYEE__SHIFTS:
				return SHIFTS_EDEFAULT == null ? shifts != null : !SHIFTS_EDEFAULT.equals(shifts);
			case MyShoppingMallPackage.EMPLOYEE__SCHEDULE:
				return schedule != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (EmployeeName: ");
		result.append(employeeName);
		result.append(", ID: ");
		result.append(id);
		result.append(", DateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", Designation: ");
		result.append(designation);
		result.append(", FiscalCode: ");
		result.append(fiscalCode);
		result.append(", Shifts: ");
		result.append(shifts);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
