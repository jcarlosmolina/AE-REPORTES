package com.keralty.aereportes.service;

import com.keralty.aereportes.repository.AnexoMatJpaRepository;
import com.keralty.aereportes.repository.AnexoNeoJpaRepository;
import com.keralty.aereportes.repository.BeneficiarioCJpaRepository;
import com.keralty.aereportes.repository.ConfiguracionANSJpaRepository;
import com.keralty.aereportes.repository.ContratoCJpaRepository;
import com.keralty.aereportes.repository.DireccionCJpaRepository;
import com.keralty.aereportes.repository.FamiliaNovedadJpaRepository;
import com.keralty.aereportes.repository.FuncionarioJpaRepository;
import com.keralty.aereportes.repository.NovedadJpaRepository;
import com.keralty.aereportes.repository.PersonaCJpaRepository;
import com.keralty.aereportes.repository.PersonaJpaRepository;
import com.keralty.aereportes.repository.UsuarioJpaRepository;
import com.keralty.aereportes.repository.UsuarioNovedadJpaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class GenericService {

    private FuncionarioJpaRepository funcionarioJpaRepository;

    private PersonaJpaRepository personaJpaRepository;

    private PersonaCJpaRepository personaCJpaRepository;

    private DireccionCJpaRepository direccionCJpaRepository;

    private UsuarioJpaRepository usuarioJpaRepository;

    private AnexoMatJpaRepository anexoMatJpaRepository;

    private AnexoNeoJpaRepository anexoNeoJpaRepository;

    private ContratoCJpaRepository contratoCJpaRepository;

    private BeneficiarioCJpaRepository beneficiarioCJpaRepository;

    private NovedadJpaRepository novedadJpaRepository;

    private FamiliaNovedadJpaRepository familiaNovedadJpaRepository;

    private UsuarioNovedadJpaRepository usuarioNovedadJpaRepository;

    private ConfiguracionANSJpaRepository configuracionANSJpaRepository;
	
	@Inject
	public GenericService(
            FuncionarioJpaRepository funcionarioJpaRepository,
            PersonaJpaRepository personaJpaRepository,
            PersonaCJpaRepository personaCJpaRepository,
            DireccionCJpaRepository direccionCJpaRepository,
            UsuarioJpaRepository usuarioJpaRepository,
            AnexoMatJpaRepository anexoMatJpaRepository,
            AnexoNeoJpaRepository anexoNeoJpaRepository,
            ContratoCJpaRepository contratoCJpaRepository,
            BeneficiarioCJpaRepository beneficiarioCJpaRepository,
            NovedadJpaRepository novedadJpaRepository,
            FamiliaNovedadJpaRepository familiaNovedadJpaRepository,
            UsuarioNovedadJpaRepository usuarioNovedadJpaRepository,
            ConfiguracionANSJpaRepository configuracionANSJpaRepository
			) {
        this.funcionarioJpaRepository = funcionarioJpaRepository;
        this.personaJpaRepository = personaJpaRepository;
        this.personaCJpaRepository = personaCJpaRepository;
        this.direccionCJpaRepository = direccionCJpaRepository;
        this.usuarioJpaRepository = usuarioJpaRepository;
        this.anexoMatJpaRepository = anexoMatJpaRepository;
        this.anexoNeoJpaRepository = anexoNeoJpaRepository;
        this.contratoCJpaRepository = contratoCJpaRepository;
        this.beneficiarioCJpaRepository = beneficiarioCJpaRepository;
        this.novedadJpaRepository = novedadJpaRepository;
        this.familiaNovedadJpaRepository = familiaNovedadJpaRepository;
        this.usuarioNovedadJpaRepository = usuarioNovedadJpaRepository;
        this.configuracionANSJpaRepository = configuracionANSJpaRepository;
	}

	public FuncionarioJpaRepository getFuncionarioJpaRepository() {
		return this.funcionarioJpaRepository;
	}
	public PersonaJpaRepository getPersonaJpaRepository() {
		return this.personaJpaRepository;
	}
	public PersonaCJpaRepository getPersonaCJpaRepository() {
		return this.personaCJpaRepository;
	}
	public DireccionCJpaRepository getDireccionCJpaRepository() {
		return this.direccionCJpaRepository;
	}
	public UsuarioJpaRepository getUsuarioJpaRepository() {
		return this.usuarioJpaRepository;
	}
	public AnexoMatJpaRepository getAnexoMatJpaRepository() {
		return this.anexoMatJpaRepository;
	}
	public AnexoNeoJpaRepository getAnexoNeoJpaRepository() {
		return this.anexoNeoJpaRepository;
	}
	public ContratoCJpaRepository getContratoCJpaRepository() {
		return this.contratoCJpaRepository;
	}
	public BeneficiarioCJpaRepository getBeneficiarioCJpaRepository() {
		return this.beneficiarioCJpaRepository;
	}
	public NovedadJpaRepository getNovedadJpaRepository() {
		return this.novedadJpaRepository;
	}
	public FamiliaNovedadJpaRepository getFamiliaNovedadJpaRepository() {
		return this.familiaNovedadJpaRepository;
	}
	public UsuarioNovedadJpaRepository getUsuarioNovedadJpaRepository() {
		return this.usuarioNovedadJpaRepository;
	}
	public ConfiguracionANSJpaRepository getConfiguracionANSJpaRepository() {
		return this.configuracionANSJpaRepository;
	}
}
