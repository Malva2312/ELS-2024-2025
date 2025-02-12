/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LoadOperation#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LoadOperation#getTable <em>Table</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LoadOperation#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoadOperation()
 * @model
 * @generated
 */
public interface LoadOperation extends TopLevelOperation
{
  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoadOperation_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LoadOperation#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoadOperation_Table()
   * @model
   * @generated
   */
  String getTable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LoadOperation#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
  void setTable(String value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLoadOperation_Nested()
   * @model unique="false"
   * @generated
   */
  EList<String> getNested();

} // LoadOperation
