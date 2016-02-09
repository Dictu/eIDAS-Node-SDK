/* 
 * 
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 * 
 * Date: 09 Feb 2016
 * Authors: Governikus GmbH & Co. KG
 * 
*/
package de.governikus.eidassaml.starterkit;

/**
 * 
 * @author hohnholt
 *
 */
public interface EidasAttribute {

	/**
	 * 
	 * @return An SAML XML attribute as String
	 */
	public String generate();
	
	/**
	 * 
	 * @return the type as string. Compare it with the Type consts of this class
	 */
	public String type();
	
	/**
	 * 
	 * @return the type as EidasNaturalPersonAttributes enum
	 */
	public EidasNaturalPersonAttributes getNaturalPersonAttributeType();
	
	
	
	public static final String TYPE_BirthName = "BirthNameAttribute";
	public static final String TYPE_CurrentAddress = "CurrentAddressAttribute";
	public static final String TYPE_DateOfBirth = "DateOfBirthAttribute";
	public static final String TYPE_FamilyName = "FamilyNameAttribute";
	public static final String TYPE_GivenName = "GivenNameAttribute";
	public static final String TYPE_PersonId = "PersonIdentifyerAttribute";
	public static final String TYPE_PlaceOfBirth = "PlaceOfBirthAttribute";

	
}
