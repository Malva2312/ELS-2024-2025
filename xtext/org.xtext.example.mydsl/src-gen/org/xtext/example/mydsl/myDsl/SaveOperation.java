/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Save Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SaveOperation#getTables <em>Tables</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SaveOperation#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SaveOperation#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSaveOperation()
 * @model
 * @generated
 */
public interface SaveOperation extends TopLevelOperation
{
  /**
   * Returns the value of the '<em><b>Tables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSaveOperation_Tables()
   * @model unique="false"
   * @generated
   */
  EList<String> getTables();

  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSaveOperation_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SaveOperation#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSaveOperation_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.SaveOperation#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

} // SaveOperation
