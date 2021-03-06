/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatamapping.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DDMStorageLinkLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DDMStorageLinkLocalService
 * @generated
 */
public class DDMStorageLinkLocalServiceWrapper
	implements DDMStorageLinkLocalService,
		ServiceWrapper<DDMStorageLinkLocalService> {
	public DDMStorageLinkLocalServiceWrapper(
		DDMStorageLinkLocalService ddmStorageLinkLocalService) {
		_ddmStorageLinkLocalService = ddmStorageLinkLocalService;
	}

	/**
	* Adds the d d m storage link to the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStorageLink the d d m storage link
	* @return the d d m storage link that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink addDDMStorageLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink ddmStorageLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.addDDMStorageLink(ddmStorageLink);
	}

	/**
	* Creates a new d d m storage link with the primary key. Does not add the d d m storage link to the database.
	*
	* @param storageLinkId the primary key for the new d d m storage link
	* @return the new d d m storage link
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink createDDMStorageLink(
		long storageLinkId) {
		return _ddmStorageLinkLocalService.createDDMStorageLink(storageLinkId);
	}

	/**
	* Deletes the d d m storage link with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param storageLinkId the primary key of the d d m storage link
	* @return the d d m storage link that was removed
	* @throws PortalException if a d d m storage link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink deleteDDMStorageLink(
		long storageLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.deleteDDMStorageLink(storageLinkId);
	}

	/**
	* Deletes the d d m storage link from the database. Also notifies the appropriate model listeners.
	*
	* @param ddmStorageLink the d d m storage link
	* @return the d d m storage link that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink deleteDDMStorageLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink ddmStorageLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.deleteDDMStorageLink(ddmStorageLink);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ddmStorageLinkLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink fetchDDMStorageLink(
		long storageLinkId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.fetchDDMStorageLink(storageLinkId);
	}

	/**
	* Returns the d d m storage link with the primary key.
	*
	* @param storageLinkId the primary key of the d d m storage link
	* @return the d d m storage link
	* @throws PortalException if a d d m storage link with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink getDDMStorageLink(
		long storageLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getDDMStorageLink(storageLinkId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the d d m storage links.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d m storage links
	* @param end the upper bound of the range of d d m storage links (not inclusive)
	* @return the range of d d m storage links
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> getDDMStorageLinks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getDDMStorageLinks(start, end);
	}

	/**
	* Returns the number of d d m storage links.
	*
	* @return the number of d d m storage links
	* @throws SystemException if a system exception occurred
	*/
	public int getDDMStorageLinksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getDDMStorageLinksCount();
	}

	/**
	* Updates the d d m storage link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ddmStorageLink the d d m storage link
	* @return the d d m storage link that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink updateDDMStorageLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink ddmStorageLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.updateDDMStorageLink(ddmStorageLink);
	}

	/**
	* Updates the d d m storage link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ddmStorageLink the d d m storage link
	* @param merge whether to merge the d d m storage link with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the d d m storage link that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink updateDDMStorageLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink ddmStorageLink,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.updateDDMStorageLink(ddmStorageLink,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _ddmStorageLinkLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ddmStorageLinkLocalService.setBeanIdentifier(beanIdentifier);
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink addStorageLink(
		long classNameId, long classPK, long structureId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.addStorageLink(classNameId, classPK,
			structureId, serviceContext);
	}

	public void deleteClassStorageLink(long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ddmStorageLinkLocalService.deleteClassStorageLink(classPK);
	}

	public void deleteStorageLink(
		com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink storageLink)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ddmStorageLinkLocalService.deleteStorageLink(storageLink);
	}

	public void deleteStorageLink(long storageLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_ddmStorageLinkLocalService.deleteStorageLink(storageLinkId);
	}

	public void deleteStructureStorageLinks(long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_ddmStorageLinkLocalService.deleteStructureStorageLinks(structureId);
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink getClassStorageLink(
		long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getClassStorageLink(classPK);
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink getStorageLink(
		long storageLinkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getStorageLink(storageLinkId);
	}

	public java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink> getStructureStorageLinks(
		long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getStructureStorageLinks(structureId);
	}

	public int getStructureStorageLinksCount(long structureId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.getStructureStorageLinksCount(structureId);
	}

	public com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink updateStorageLink(
		long storageLinkId, long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ddmStorageLinkLocalService.updateStorageLink(storageLinkId,
			classNameId, classPK);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DDMStorageLinkLocalService getWrappedDDMStorageLinkLocalService() {
		return _ddmStorageLinkLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDDMStorageLinkLocalService(
		DDMStorageLinkLocalService ddmStorageLinkLocalService) {
		_ddmStorageLinkLocalService = ddmStorageLinkLocalService;
	}

	public DDMStorageLinkLocalService getWrappedService() {
		return _ddmStorageLinkLocalService;
	}

	public void setWrappedService(
		DDMStorageLinkLocalService ddmStorageLinkLocalService) {
		_ddmStorageLinkLocalService = ddmStorageLinkLocalService;
	}

	private DDMStorageLinkLocalService _ddmStorageLinkLocalService;
}