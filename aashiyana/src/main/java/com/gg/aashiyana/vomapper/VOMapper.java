/**
 * 
 */
package com.gg.aashiyana.vomapper;

/**
 * @author User
 *
 */
public interface VOMapper<VO, DOMAIN> {
	
	VO populateVOFromDomain(DOMAIN domain);
	
	DOMAIN populateDomainFromVO(VO voBean);

}
