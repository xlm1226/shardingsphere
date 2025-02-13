/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.scaling.core.job.check;

import org.apache.shardingsphere.scaling.core.job.check.consistency.DataConsistencyChecker;
import org.apache.shardingsphere.scaling.core.job.check.source.DataSourceChecker;
import org.apache.shardingsphere.scaling.core.job.preparer.DataSourcePreparer;

/**
 * Environment checker.
 */
public interface EnvironmentChecker {
    
    /**
     * Get data source checker type.
     *
     * @return data source checker type.
     */
    Class<? extends DataSourceChecker> getDataSourceCheckerClass();
    
    /**
     * Get data consistency checker type.
     *
     * @return data consistency checker type.
     */
    Class<? extends DataConsistencyChecker> getDataConsistencyCheckerClass();
    
    /**
     * Get data source preparer type.
     *
     * @return data source preparer type.
     */
    Class<? extends DataSourcePreparer> getDataSourcePreparerClass();
}
