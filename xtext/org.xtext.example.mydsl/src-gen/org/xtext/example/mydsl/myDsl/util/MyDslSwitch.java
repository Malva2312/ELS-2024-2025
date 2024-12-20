/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TOP_LEVEL_OPERATION:
      {
        TopLevelOperation topLevelOperation = (TopLevelOperation)theEObject;
        T result = caseTopLevelOperation(topLevelOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOAD_OPERATION:
      {
        LoadOperation loadOperation = (LoadOperation)theEObject;
        T result = caseLoadOperation(loadOperation);
        if (result == null) result = caseTopLevelOperation(loadOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOAD_JSON:
      {
        LoadJSON loadJSON = (LoadJSON)theEObject;
        T result = caseLoadJSON(loadJSON);
        if (result == null) result = caseLoadOperation(loadJSON);
        if (result == null) result = caseTopLevelOperation(loadJSON);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOAD_XML:
      {
        LoadXML loadXML = (LoadXML)theEObject;
        T result = caseLoadXML(loadXML);
        if (result == null) result = caseLoadOperation(loadXML);
        if (result == null) result = caseTopLevelOperation(loadXML);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOAD_YAML:
      {
        LoadYAML loadYAML = (LoadYAML)theEObject;
        T result = caseLoadYAML(loadYAML);
        if (result == null) result = caseLoadOperation(loadYAML);
        if (result == null) result = caseTopLevelOperation(loadYAML);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONCAT_OPERATION:
      {
        ConcatOperation concatOperation = (ConcatOperation)theEObject;
        T result = caseConcatOperation(concatOperation);
        if (result == null) result = caseTopLevelOperation(concatOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FILTER_OPERATION:
      {
        FilterOperation filterOperation = (FilterOperation)theEObject;
        T result = caseFilterOperation(filterOperation);
        if (result == null) result = caseTopLevelOperation(filterOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SAVE_OPERATION:
      {
        SaveOperation saveOperation = (SaveOperation)theEObject;
        T result = caseSaveOperation(saveOperation);
        if (result == null) result = caseTopLevelOperation(saveOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRINT_OPERATION:
      {
        PrintOperation printOperation = (PrintOperation)theEObject;
        T result = casePrintOperation(printOperation);
        if (result == null) result = caseTopLevelOperation(printOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PRINT_TABLE:
      {
        PrintTable printTable = (PrintTable)theEObject;
        T result = casePrintTable(printTable);
        if (result == null) result = casePrintOperation(printTable);
        if (result == null) result = caseTopLevelOperation(printTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RENAME_OPERATION:
      {
        RenameOperation renameOperation = (RenameOperation)theEObject;
        T result = caseRenameOperation(renameOperation);
        if (result == null) result = caseTopLevelOperation(renameOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LIMIT_OPERATION:
      {
        LimitOperation limitOperation = (LimitOperation)theEObject;
        T result = caseLimitOperation(limitOperation);
        if (result == null) result = caseTopLevelOperation(limitOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARG_MAX_OPERATION:
      {
        ArgMaxOperation argMaxOperation = (ArgMaxOperation)theEObject;
        T result = caseArgMaxOperation(argMaxOperation);
        if (result == null) result = caseTopLevelOperation(argMaxOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARG_MIN_OPERATION:
      {
        ArgMinOperation argMinOperation = (ArgMinOperation)theEObject;
        T result = caseArgMinOperation(argMinOperation);
        if (result == null) result = caseTopLevelOperation(argMinOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SELECT_OPERATION:
      {
        SelectOperation selectOperation = (SelectOperation)theEObject;
        T result = caseSelectOperation(selectOperation);
        if (result == null) result = caseTopLevelOperation(selectOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DROP_OPERATION:
      {
        DropOperation dropOperation = (DropOperation)theEObject;
        T result = caseDropOperation(dropOperation);
        if (result == null) result = caseTopLevelOperation(dropOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROCESS_FOLDERS_OPERATION:
      {
        ProcessFoldersOperation processFoldersOperation = (ProcessFoldersOperation)theEObject;
        T result = caseProcessFoldersOperation(processFoldersOperation);
        if (result == null) result = caseTopLevelOperation(processFoldersOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelOperation(TopLevelOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadOperation(LoadOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load JSON</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load JSON</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadJSON(LoadJSON object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load XML</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load XML</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadXML(LoadXML object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load YAML</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load YAML</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadYAML(LoadYAML object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concat Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concat Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcatOperation(ConcatOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterOperation(FilterOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Save Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Save Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSaveOperation(SaveOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintOperation(PrintOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintTable(PrintTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rename Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rename Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRenameOperation(RenameOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimitOperation(LimitOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg Max Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg Max Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgMaxOperation(ArgMaxOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg Min Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg Min Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgMinOperation(ArgMinOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectOperation(SelectOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drop Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drop Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDropOperation(DropOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Process Folders Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Process Folders Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessFoldersOperation(ProcessFoldersOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
