package tim15.pki.dto.builders;

import tim15.pki.dto.CertificateGenDTO;
import tim15.pki.dto.ExtensionDTO;
import tim15.pki.dto.X500NameCustom;

import java.util.Set;

public class CertificateGenDTOBuilder {
    private Long id;
    private String serialNumber;
    private boolean isCA;
    private String parentSerialNumber;
    private String issuedTo;
    private String issuedBy;
    private String startDate;
    private String endDate;
    private Set<ExtensionDTO> extensions;
    private X500NameCustom x500NameCustom;

    public CertificateGenDTOBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public CertificateGenDTOBuilder setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public CertificateGenDTOBuilder setIsCA(boolean isCA) {
        this.isCA = isCA;
        return this;
    }

    public CertificateGenDTOBuilder setParentSerialNumber(String parentSerialNumber) {
        this.parentSerialNumber = parentSerialNumber;
        return this;
    }

    public CertificateGenDTOBuilder setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
        return this;
    }

    public CertificateGenDTOBuilder setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    public CertificateGenDTOBuilder setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public CertificateGenDTOBuilder setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public CertificateGenDTOBuilder setExtensions(Set<ExtensionDTO> extensions) {
        this.extensions = extensions;
        return this;
    }

    public CertificateGenDTOBuilder setX500NameCustom(X500NameCustom x500NameCustom) {
        this.x500NameCustom = x500NameCustom;
        return this;
    }

    public CertificateGenDTO createCertificateGenDTO() {
        return new CertificateGenDTO(id, serialNumber, isCA, parentSerialNumber, issuedTo, issuedBy, startDate, endDate, extensions, x500NameCustom);
    }
}
