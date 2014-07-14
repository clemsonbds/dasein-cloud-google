/**
 * Copyright (C) 2012-2013 Dell, Inc
 * See annotations for authorship information
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.dasein.cloud.google.compute;

import javax.annotation.Nonnull;

import org.dasein.cloud.compute.AbstractComputeServices;
import org.dasein.cloud.compute.AffinityGroupSupport;
import org.dasein.cloud.google.Google;
import org.dasein.cloud.google.compute.server.DiskSupport;
import org.dasein.cloud.google.compute.server.ImageSupport;
import org.dasein.cloud.google.compute.server.ServerSupport;
import org.dasein.cloud.google.compute.server.SnapshotSupport;

/**
 * Implements the compute services supported in the Google API.
 * @author INSERT NAME HERE
 * @version 2013.01 initial version
 * @since 2013.01
 */
public class GoogleCompute extends AbstractComputeServices {
	private Google provider;

    public GoogleCompute(Google provider) { this.provider = provider; }

    public @Nonnull ServerSupport getVirtualMachineSupport() {
        return new ServerSupport(provider);
    }
    
    public @Nonnull DiskSupport getVolumeSupport() {
        return new DiskSupport(provider);
    }
    
    public @Nonnull SnapshotSupport getSnapshotSupport() {
        return new SnapshotSupport(provider);
    }
    
    public @Nonnull ImageSupport getImageSupport() {
        return new ImageSupport(provider);
    }

    @Override
    public AffinityGroupSupport getAffinityGroupSupport() {
        // TODO Auto-generated method stub
        //return new AffinityGroupSupport(provider);
        return null;
    }

    @Override
    public boolean hasAffinityGroupSupport() {
        // TODO Auto-generated method stub
        return false;
    }


}
