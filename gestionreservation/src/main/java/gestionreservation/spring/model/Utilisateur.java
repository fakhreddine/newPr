package gestionreservation.spring.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
//@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
@Table(name = "utilisateur")
public class Utilisateur extends Personne implements UserDetails{
	private static final long serialVersionUID = 1L;
	
	 @Column(name = "idUtilisateur")
	private String idUtilisateur;
	 @Column(name = "login")
	private String login;
	 @Column(name = "motDePass")
	private String motDePass;
	 @Column(name = "isAccountNonExpired" ,insertable = false, updatable = false)
	private boolean isAccountNonExpired;
	 @Column(name = "isAccountNonExpired")
	private boolean isAccountNonLocked;
	 @Column(name = "isCredentialsNonExpired")
		private boolean isCredentialsNonExpired;
	 @Column(name = "isEnabled")
		private boolean isEnabled;
	 @OneToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="idHotel")
		private  Hotel hotel;
	 
	 
	 
	//bi-directional many-to-many association to Reservation
		@ManyToMany
		@JoinTable(
			name="possedeRole"
			, joinColumns={
				@JoinColumn(name="idUtilisateur")
				}
			, inverseJoinColumns={
				@JoinColumn(name="idRole")
				}
			) 
	private List<Role> roles;
	 
		public List<Role> getRole() {
			return this.roles;
		}

		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}
	 
	 
	 
	 
	 
	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="agent")
	private List<Reservation> reservationspar;

	@OneToMany(mappedBy="client")
	private List<Reservation> reservations;
	
	
	

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePass() {
		return this.motDePass;
	}

	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}


	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);


		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setAgent(null);
		reservation.setClient(null);

		return reservation;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles;
	}
	public void setAuthorities(List<Role> authorities) {
		this.roles = authorities;
	}

	@Override
	public String getPassword() {
		return this.motDePass;
	}

	@Override
	public String getUsername() {
		return this.getEmailPers();
	}
	
	public void setUsername() {
		this.setEmailPers(this.getEmailPers());
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.isAccountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.isCredentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return this.isEnabled;
	}


}