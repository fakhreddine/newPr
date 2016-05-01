package gestionreservation.spring.model;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name = "role")
public class Role implements GrantedAuthority{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "idRole")
	private int idRole;
	 @Column(name = "descriptionRole")
	private String descriptionRole;
	 
	 
	//bi-directional many-to-many association to Reservation
		@ManyToMany
		@JoinTable(
			name="possedrole"
			, joinColumns={
				@JoinColumn(name="idRole")
				}
			, inverseJoinColumns={
				@JoinColumn(name="idUtilisateur")
				}
			)
		private List<Utilisateur> utilisateurs;
	 
	 
	//bi-directional many-to-many association to Chambre
		@ManyToMany(mappedBy="roles")
		
		
		public List<Utilisateur> getUtilisateurs() {
			return this.utilisateurs;
		}

		public void setUtilisateurs(List<Utilisateur> utilisateurs) {
			this.utilisateurs = utilisateurs;
		}

		public int getIdRole() {
			return idRole;
		}

		public void setIdRole(int idRole) {
			this.idRole = idRole;
		}

		public String getDescriptionRole() {
			return descriptionRole;
		}

		public void setDescriptionRole(String descriptionRole) {
			this.descriptionRole = descriptionRole;
		}

		@Override
		public String getAuthority() {
			return descriptionRole;
		}
		
}