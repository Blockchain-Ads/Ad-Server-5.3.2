/*
+---------------------------------------------------------------------------+
| Blockchain-Ads Adserver                                                          |
| https://www.blockchain-ads.com/adserver                                           |
|                                                                           |
| Copyright: See the COPYRIGHT.txt file.                                    |
| License: GPLv2 or later, see the LICENSE.txt file.                        |
+---------------------------------------------------------------------------+
*/

package org.openads.proxy;
import java.util.Date;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;

/**
 * The Class AgencyService.
 *
 */
class AgencyService extends AbstractService {
	private static final String AGENCY_SERVICE = "";
	
	private static final String ADD_AGENCY_METHOD = "ox.addAgency";
	private static final String DELETE_AGENCY_METHOD = "ox.deleteAgency";
	private static final String MODIFY_AGENCY_METHOD = "ox.modifyAgency";
	private static final String GET_AGENCY_LIST_METHOD = "ox.getAgencyList";
	private static final String GET_AGENCY_METHOD = "ox.getAgency";
	private static final String AGENCY_ADVERTISER_STATISTICS_METHOD = "ox.agencyAdvertiserStatistics";
	private static final String AGENCY_BANNER_STATISTICS_METHOD = "ox.agencyBannerStatistics";
	private static final String AGENCY_CAMPAIGN_STATISTICS_METHOD = "ox.agencyCampaignStatistics";
	private static final String AGENCY_DAILY_STATISTICS_METHOD = "ox.agencyDailyStatistics";
	private static final String AGENCY_HOURLY_STATISTICS_METHOD = "ox.agencyHourlyStatistics";
	private static final String AGENCY_PUBLISHER_STATISTICS_METHOD = "ox.agencyPublisherStatistics";
	private static final String AGENCY_ZONE_STATISTICS_METHOD = "ox.agencyZoneStatistics";

	/**
	 * Instantiates a new agency service.
	 *
	 * @param client the client
	 * @param basepath the basepath
	 */
	public AgencyService(XmlRpcClient client, String basepath) {
		super(client, basepath);
	}

	/* (non-Javadoc)
	 * @see org.openads.proxy.AbstractService#getService()
	 */
	@Override
	public String getService() {
		return AGENCY_SERVICE;
	}

	/**
	 * Adds the agency.
	 *
	 * @param params the params
	 *
	 * @return the integer
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Integer addAgency(Map params) throws XmlRpcException {
		return (Integer) execute(ADD_AGENCY_METHOD, params);
	}

	/**
	 * Modify agency.
	 *
	 * @param params the params
	 *
	 * @return the boolean
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Boolean modifyAgency(Map params) throws XmlRpcException {
		return (Boolean) execute(MODIFY_AGENCY_METHOD, params);
	}

	/**
	 * Delete agency.
	 *
	 * @param id the id
	 *
	 * @return the boolean
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Boolean deleteAgency(Integer id) throws XmlRpcException {
		return (Boolean) execute(DELETE_AGENCY_METHOD, id);
	}

	/**
	 * Gets the agency.
	 *
	 * @param id the id
	 *
	 * @return the agency
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map getAgency(Integer id) throws XmlRpcException {
		return (Map) execute(GET_AGENCY_METHOD, id);
	}

	/**
	 * Gets the agency list.
	 *
	 * @return the agency list
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] getAgencyList() throws XmlRpcException {
		return objectToArrayMaps(execute(GET_AGENCY_LIST_METHOD));
	}

	/**
	 * Agency zone statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyZoneStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ZONE_STATISTICS_METHOD, id));
	}

	/**
	 * Agency zone statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyZoneStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ZONE_STATISTICS_METHOD, id,
				startDate));
	}

	/**
	 * Agency zone statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyZoneStatistics(Integer id, Date startDate, Date endDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ZONE_STATISTICS_METHOD, id,
				startDate, endDate));
	}

	/**
	 * Agency zone statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyZoneStatistics(Integer id, Date startDate, Date endDate, Boolean useLocalTimeZone)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ZONE_STATISTICS_METHOD, id,
				startDate, endDate, useLocalTimeZone));
	}

	/**
	 * Agency advertiser statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyAdvertiserStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ADVERTISER_STATISTICS_METHOD,
				id));
	}

	/**
	 * Agency advertiser statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyAdvertiserStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ADVERTISER_STATISTICS_METHOD,
				id, startDate));
	}

	/**
	 * Agency advertiser statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyAdvertiserStatistics(Integer id, Date startDate,
			Date endDate) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ADVERTISER_STATISTICS_METHOD,
				id, startDate, endDate));
	}

	/**
	 * Agency advertiser statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyAdvertiserStatistics(Integer id, Date startDate,
			Date endDate, Boolean useLocalTimeZone) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_ADVERTISER_STATISTICS_METHOD,
				id, startDate, endDate, useLocalTimeZone));
	}

	/**
	 * Agency banner statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyBannerStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_BANNER_STATISTICS_METHOD, id));
	}

	/**
	 * Agency banner statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyBannerStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_BANNER_STATISTICS_METHOD, id,
				startDate));
	}

	/**
	 * Agency banner statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyBannerStatistics(Integer id, Date startDate, Date endDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_BANNER_STATISTICS_METHOD, id,
				startDate, endDate));
	}

	/**
	 * Agency banner statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyBannerStatistics(Integer id, Date startDate, Date endDate, Boolean useLocalTimeZone)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_BANNER_STATISTICS_METHOD, id,
				startDate, endDate, useLocalTimeZone));
	}

	/**
	 * Agency campaign statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyCampaignStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_CAMPAIGN_STATISTICS_METHOD, id));
	}

	/**
	 * Agency campaign statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyCampaignStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_CAMPAIGN_STATISTICS_METHOD, id,
				startDate));
	}

	/**
	 * Agency campaign statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyCampaignStatistics(Integer id, Date startDate,
			Date endDate) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_CAMPAIGN_STATISTICS_METHOD, id,
				startDate, endDate));
	}

	/**
	 * Agency campaign statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyCampaignStatistics(Integer id, Date startDate,
			Date endDate, Boolean useLocalTimeZone) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_CAMPAIGN_STATISTICS_METHOD, id,
				startDate, endDate, useLocalTimeZone));
	}

	/**
	 * Agency daily statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyDailyStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_DAILY_STATISTICS_METHOD, id));
	}

	/**
	 * Agency daily statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyDailyStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_DAILY_STATISTICS_METHOD, id,
				startDate));
	}

	/**
	 * Agency daily statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyDailyStatistics(Integer id, Date startDate, Date endDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_DAILY_STATISTICS_METHOD, id,
				startDate, endDate));
	}

	/**
	 * Agency daily statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyDailyStatistics(Integer id, Date startDate, Date endDate, Boolean useLocalTimeZone)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_DAILY_STATISTICS_METHOD, id,
				startDate, endDate, useLocalTimeZone));
	}

	/**
	 * Agency hourly statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyHourlyStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_HOURLY_STATISTICS_METHOD, id));
	}

	/**
	 * Agency hourly statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyHourlyStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_HOURLY_STATISTICS_METHOD, id,
				startDate));
	}

	/**
	 * Agency hourly statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyHourlyStatistics(Integer id, Date startDate, Date endDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_HOURLY_STATISTICS_METHOD, id,
				startDate, endDate));
	}

	/**
	 * Agency hourly statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyHourlyStatistics(Integer id, Date startDate, Date endDate, Boolean useLocalTimeZone)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_HOURLY_STATISTICS_METHOD, id,
				startDate, endDate, useLocalTimeZone));
	}

	/**
	 * Agency publisher statistics.
	 *
	 * @param id the id
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyPublisherStatistics(Integer id) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_PUBLISHER_STATISTICS_METHOD, id));
	}

	/**
	 * Agency publisher statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyPublisherStatistics(Integer id, Date startDate)
			throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_PUBLISHER_STATISTICS_METHOD, id,
				startDate));
	}

	/**
	 * Agency publisher statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyPublisherStatistics(Integer id, Date startDate,
			Date endDate) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_PUBLISHER_STATISTICS_METHOD, id,
				startDate, endDate));
	}

	/**
	 * Agency publisher statistics.
	 *
	 * @param id the id
	 * @param startDate the start date
	 * @param endDate the end date
	 * @param useLocalTimeZone
	 *
	 * @return the Map[]
	 *
	 * @throws XmlRpcException the xml rpc exception
	 */
	public Map[] agencyPublisherStatistics(Integer id, Date startDate,
			Date endDate, Boolean useLocalTimeZone) throws XmlRpcException {
		return objectToArrayMaps(execute(AGENCY_PUBLISHER_STATISTICS_METHOD, id,
				startDate, endDate, useLocalTimeZone));
	}
}
