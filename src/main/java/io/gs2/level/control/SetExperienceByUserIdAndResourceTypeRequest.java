/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.level.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.level.model.*;
import io.gs2.level.Gs2Level;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class SetExperienceByUserIdAndResourceTypeRequest extends Gs2BasicRequest<SetExperienceByUserIdAndResourceTypeRequest> {

	public static class Constant extends Gs2Level.Constant {
		public static final String FUNCTION = "SetExperienceByUserId";
	}

	/** リソースプール */
	private String resourcePoolName;

	/** リソースタイプ */
	private String resourceTypeName;

	/** リソースID */
	private String resourceId;

	/** ステータス */
	private String userId;

	/** 新しい累計獲得経験値 */
	private Long experience;


	/**
	 * リソースプールを取得
	 *
	 * @return リソースプール
	 */
	public String getResourcePoolName() {
		return resourcePoolName;
	}

	/**
	 * リソースプールを設定
	 *
	 * @param resourcePoolName リソースプール
	 */
	public void setResourcePoolName(String resourcePoolName) {
		this.resourcePoolName = resourcePoolName;
	}

	/**
	 * リソースプールを設定
	 *
	 * @param resourcePoolName リソースプール
	 * @return this
	 */
	public SetExperienceByUserIdAndResourceTypeRequest withResourcePoolName(String resourcePoolName) {
		setResourcePoolName(resourcePoolName);
		return this;
	}

	/**
	 * リソースタイプを取得
	 *
	 * @return リソースタイプ
	 */
	public String getResourceTypeName() {
		return resourceTypeName;
	}

	/**
	 * リソースタイプを設定
	 *
	 * @param resourceTypeName リソースタイプ
	 */
	public void setResourceTypeName(String resourceTypeName) {
		this.resourceTypeName = resourceTypeName;
	}

	/**
	 * リソースタイプを設定
	 *
	 * @param resourceTypeName リソースタイプ
	 * @return this
	 */
	public SetExperienceByUserIdAndResourceTypeRequest withResourceTypeName(String resourceTypeName) {
		setResourceTypeName(resourceTypeName);
		return this;
	}

	/**
	 * リソースIDを取得
	 *
	 * @return リソースID
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * リソースIDを設定
	 *
	 * @param resourceId リソースID
	 */
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	/**
	 * リソースIDを設定
	 *
	 * @param resourceId リソースID
	 * @return this
	 */
	public SetExperienceByUserIdAndResourceTypeRequest withResourceId(String resourceId) {
		setResourceId(resourceId);
		return this;
	}

	/**
	 * ステータスを取得
	 *
	 * @return ステータス
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * ステータスを設定
	 *
	 * @param userId ステータス
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * ステータスを設定
	 *
	 * @param userId ステータス
	 * @return this
	 */
	public SetExperienceByUserIdAndResourceTypeRequest withUserId(String userId) {
		setUserId(userId);
		return this;
	}

	/**
	 * 新しい累計獲得経験値を取得
	 *
	 * @return 新しい累計獲得経験値
	 */
	public Long getExperience() {
		return experience;
	}

	/**
	 * 新しい累計獲得経験値を設定
	 *
	 * @param experience 新しい累計獲得経験値
	 */
	public void setExperience(Long experience) {
		this.experience = experience;
	}

	/**
	 * 新しい累計獲得経験値を設定
	 *
	 * @param experience 新しい累計獲得経験値
	 * @return this
	 */
	public SetExperienceByUserIdAndResourceTypeRequest withExperience(Long experience) {
		setExperience(experience);
		return this;
	}

}