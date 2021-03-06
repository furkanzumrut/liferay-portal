/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.journal.util;

import com.liferay.portal.kernel.portlet.PortletRequestModel;
import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.journal.model.JournalArticleDisplay;

/**
 * @author Raymond Augé
 */
public class JournalContentUtil {

	public static void clearCache() {
		getJournalContent().clearCache();
	}

	public static void clearCache(
		long groupId, String articleId, String ddmTemplateKey) {

		getJournalContent().clearCache(groupId, articleId, ddmTemplateKey);
	}

	public static String getContent(
		long groupId, String articleId, String viewMode, String languageId,
		PortletRequestModel portletRequestModel) {

		return getJournalContent().getContent(
			groupId, articleId, viewMode, languageId, portletRequestModel);
	}

	public static String getContent(
		long groupId, String articleId, String ddmTemplateKey, String viewMode,
		String languageId, PortletRequestModel portletRequestModel) {

		return getJournalContent().getContent(
			groupId, articleId, ddmTemplateKey, viewMode, languageId,
			portletRequestModel);
	}

	public static String getContent(
		long groupId, String articleId, String ddmTemplateKey, String viewMode,
		String languageId, PortletRequestModel portletRequestModel,
		ThemeDisplay themeDisplay) {

		return getJournalContent().getContent(
			groupId, articleId, ddmTemplateKey, viewMode, languageId,
			portletRequestModel, themeDisplay);
	}

	public static String getContent(
		long groupId, String articleId, String ddmTemplateKey, String viewMode,
		String languageId, ThemeDisplay themeDisplay) {

		return getJournalContent().getContent(
			groupId, articleId, ddmTemplateKey, viewMode, languageId,
			themeDisplay);
	}

	public static String getContent(
		long groupId, String articleId, String viewMode, String languageId,
		ThemeDisplay themeDisplay) {

		return getJournalContent().getContent(
			groupId, articleId, viewMode, languageId, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, double version, String ddmTemplateKey,
		String viewMode, String languageId, int page,
		PortletRequestModel portletRequestModel, ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, version, ddmTemplateKey, viewMode, languageId,
			page, portletRequestModel, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String viewMode, String languageId,
		int page, ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, viewMode, languageId, page, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String viewMode, String languageId,
		PortletRequestModel portletRequestModel) {

		return getJournalContent().getDisplay(
			groupId, articleId, viewMode, languageId, portletRequestModel);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String ddmTemplateKey, String viewMode,
		String languageId, int page, PortletRequestModel portletRequestModel,
		ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, ddmTemplateKey, viewMode, languageId, page,
			portletRequestModel, themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String ddmTemplateKey, String viewMode,
		String languageId, PortletRequestModel portletRequestModel) {

		return getJournalContent().getDisplay(
			groupId, articleId, ddmTemplateKey, viewMode, languageId,
			portletRequestModel);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String ddmTemplateKey, String viewMode,
		String languageId, ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, ddmTemplateKey, viewMode, languageId,
			themeDisplay);
	}

	public static JournalArticleDisplay getDisplay(
		long groupId, String articleId, String viewMode, String languageId,
		ThemeDisplay themeDisplay) {

		return getJournalContent().getDisplay(
			groupId, articleId, viewMode, languageId, themeDisplay);
	}

	public static JournalContent getJournalContent() {
		PortalRuntimePermission.checkGetBeanProperty(JournalContentUtil.class);

		return _journalContent;
	}

	public void setJournalContent(JournalContent journalContent) {
		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_journalContent = journalContent;
	}

	private static JournalContent _journalContent;

}