# Copyright (C) 2015-2019 Elnico

CORE_IMAGE_EXTRA_INSTALL += "eupdate"

# Store the build timestamp as eupdate version number
ROOTFS_POSTPROCESS_COMMAND += "set_eupdate_version; "

set_eupdate_version () {
	sed -i 's/EUPDATE_VERSION="000"/EUPDATE_VERSION="${DATETIME}"/g' ${IMAGE_ROOTFS}${sysconfdir}/eupdate/config/manifest
}
