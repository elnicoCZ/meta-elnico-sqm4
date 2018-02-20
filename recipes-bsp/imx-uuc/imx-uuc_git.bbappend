# Get rid of the "QA Issue: No GNU_HASH in the elf binary" error
INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"

