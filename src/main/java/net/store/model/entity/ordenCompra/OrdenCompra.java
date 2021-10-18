package net.store.model.entity.ordenCompra;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import net.store.model.entity.cliente.Cliente;
import net.store.model.entity.ordenCompraItem.OrdenCompraItem;

@Entity
@Table(name = "ORDEN_COMPRA")
@Data
public class OrdenCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column
	private Integer nurmeoCompra;
	
	@Column
	private Date fechaCompra;
	
	@Column
	private BigDecimal importeTotal;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@OneToMany
	@JoinColumn(name = "orden_compra_id")
	private Set<OrdenCompraItem> items;
	
}