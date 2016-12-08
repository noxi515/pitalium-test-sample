/*
 * Copyright 2016 noxi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.noxi.pitalium.sample;

import com.htmlhifive.pitalium.core.PtlTestBase;
import org.junit.Test;

/**
 * Googleの検索をしてみるページ
 */
public class SearchGoogleTest extends PtlTestBase {

    @Test
    public void search() throws Exception {
        // ページにアクセス
        driver.get(null);

        // トップページのスクリーンショット撮影
        assertionView.assertView("TopPage");

        // 検索
        driver.findElementByCssSelector("[name=q]").sendKeys("Selenium");
        driver.findElementByCssSelector("[name=btnG]").click();

        // 検索結果のスクリーンショット撮影
        assertionView.assertView("SearchResultPage");
    }

}
