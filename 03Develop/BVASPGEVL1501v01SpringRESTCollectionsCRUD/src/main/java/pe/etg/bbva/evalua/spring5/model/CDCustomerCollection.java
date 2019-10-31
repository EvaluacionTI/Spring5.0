package pe.etg.bbva.evalua.spring5.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pe.etg.bbva.evalua.spring5.entity.CECustomer;

@Component
public class CDCustomerCollection {
	// Dummy database. Initialize with some dummy values.
		private static List<CECustomer> CECustomers;
		{
			CECustomers = new ArrayList<CECustomer>();
			CECustomers.add(new CECustomer(101, "Mery", "Rosa", "mrosa@gmail.com", "121-232-3435"));
			CECustomers.add(new CECustomer(201, "Esteban", "Alexander", "ealexander@gmail.com", "343-545-2345"));
			CECustomers.add(new CECustomer(301, "Illari", "Isabel", "iisabel@gmail.com", "876-237-2987"));
			CECustomers.add(new CECustomer(System.currentTimeMillis(), "Chabelo", "Alexei", "calexei@gmail.com", "356-758-8736"));
			CECustomers.add(new CECustomer(System.currentTimeMillis(), "Toro", "Cristobal", "tcristobal@gmail.com", "356-758-8736"));
		}

		/**
		 * Returns list of CECustomers from dummy database.
		 * 
		 * @return list of CECustomers
		 */
		public List<CECustomer> list() {
			return CECustomers;
		}

		/**
		 * Return CECustomer object for given id from dummy database. If CECustomer is
		 * not found for id, returns null.
		 * 
		 * @param id
		 *            CECustomer id
		 * @return CECustomer object for given id
		 */
		public CECustomer get(Long id) {

			for (CECustomer c : CECustomers) {
				if (c.getId().equals(id)) {
					return c;
				}
			}
			return null;
		}

		/**
		 * Create new CECustomer in dummy database. Updates the id and insert new
		 * CECustomer in list.
		 * 
		 * @param CECustomer
		 *            CECustomer object
		 * @return CECustomer object with updated id
		 */
		public CECustomer create(CECustomer CECustomer) {
			CECustomer.setId(System.currentTimeMillis());
			CECustomers.add(CECustomer);
			return CECustomer;
		}

		/**
		 * Delete the CECustomer object from dummy database. If CECustomer not found for
		 * given id, returns null.
		 * 
		 * @param id
		 *            the CECustomer id
		 * @return id of deleted CECustomer object
		 */
		public Long delete(Long id) {

			for (CECustomer c : CECustomers) {
				if (c.getId().equals(id)) {
					CECustomers.remove(c);
					return id;
				}
			}

			return null;
		}

		/**
		 * Update the CECustomer object for given id in dummy database. If CECustomer
		 * not exists, returns null
		 * 
		 * @param id
		 * @param CECustomer
		 * @return CECustomer object with id
		 */
		public CECustomer update(Long id, CECustomer CECustomer) {

			for (CECustomer c : CECustomers) {
				if (c.getId().equals(id)) {
					CECustomer.setId(c.getId());
					CECustomers.remove(c);
					CECustomers.add(CECustomer);
					return CECustomer;
				}
			}

			return null;
		}
}
