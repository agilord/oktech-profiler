/* 
 * Copyright (c) 2009-2010, OKTECH-Info Kft. - All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Please check attribution requirements at
 * 
 * http://code.google.com/p/oktech-profiler/wiki/License
 * 
 */
package hu.oktech.profiler.runtime.jmx;

/**
 * Spring-compatible utility class that help to access the
 * {@link JmxConnectionService} through a static getter. The default
 * implementation is auto-populated.
 * 
 * @author Istvan Soos
 * 
 */
public abstract class JmxConnectionUtils {

	private static JmxConnectionService service = new JmxConnectionServiceImpl();

	public static JmxConnectionService get() {
		return service;
	}

	public static void set(JmxConnectionService service_) {
		service = service_;
	}

	public void setService(JmxConnectionService service_) {
		service = service_;
	}

}
