package net.store.model.entity.ordenCompraItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import net.store.model.entity.ordenCompra.OrdenCompra;
import net.store.model.entity.telefono.Telefono;

@Entity
@Table(name = "ORDEN_COMPRA_ITEM")
@Data
public class OrdenCompraItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column
	private Integer cantidad;

	@ManyToOne
	private OrdenCompra ordenCompra;
	
	@ManyToOne
	private Telefono telefono;
}
