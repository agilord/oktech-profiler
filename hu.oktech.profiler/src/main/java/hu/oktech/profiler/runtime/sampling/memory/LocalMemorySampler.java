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
package hu.oktech.profiler.runtime.sampling.memory;

/**
 * Low-overhead memory sampler
 * 
 * @author Istvan Soos
 * 
 */
public class LocalMemorySampler implements MemorySampler {

	public MemoryData getMemoryData() {
		Runtime r = Runtime.getRuntime();
		return new MemoryData(r.maxMemory() - r.freeMemory(), 0, 0, System.currentTimeMillis());
	}

}
