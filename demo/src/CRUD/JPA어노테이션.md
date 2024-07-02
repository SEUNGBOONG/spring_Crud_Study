@Getter와 @Setter:

Lombok 라이브러리에서 제공하는 애노테이션으로, 클래스의 모든 필드에 대해 getter와 setter 메서드를 자동으로 생성해 줍니다. 이로 인해 코드가 간결해지고, 수작업으로 getter와 setter를 작성할 필요가 없어집니다.
@Entity:

JPA에서 제공하는 애노테이션으로, 이 클래스가 데이터베이스의 테이블과 매핑된다는 것을 나타냅니다. JPA는 이 클래스의 인스턴스를 데이터베이스 테이블의 레코드로 관리합니다.
@Table(name = "user"):

JPA에서 제공하는 애노테이션으로, 이 엔티티가 매핑될 테이블의 이름을 지정합니다. 여기서는 "user"라는 테이블에 매핑됩니다. 만약 이 애노테이션을 생략하면, 엔티티의 이름이 그대로 테이블 이름으로 사용됩니다.
@Id:

JPA에서 제공하는 애노테이션으로, 이 필드가 엔티티의 기본 키(Primary Key)임을 나타냅니다. 기본 키는 데이터베이스에서 각 레코드를 고유하게 식별하는 데 사용됩니다.
@GeneratedValue:

JPA에서 제공하는 애노테이션으로, 기본 키 값을 자동으로 생성하도록 지정합니다. 기본 키의 생성 전략은 설정에 따라 달라질 수 있으며, 일반적으로 데이터베이스의 시퀀스나 자동 증가 컬럼을 사용합니다.


    @GeneratedValue(strategy = GenerationType.IDENTITY)


@OneToMany: 일다다 관계 매핑입니다. mappedBy를 통해서 연관관계 주인 필드를 설정합니다.
@ManyToOne: OneToMany의 반대 관계인 N:1 관계 매핑 어노테이션입니다.
@JoinColumn: 외래키를 매핑할때 사용합니다. name에는 참조하는 테이블의 기본키 칼럼명이 들어갑니다.
cascade: JPA에는 영속화란 개념이 있습니다. CascadeType.ALL이면 부모가 영속화가 되면 자식도 영속화가 됩니다. 정확한 표현은 아니지만 부모와 자식의 상태가 동시에 변하게 합니다.
fetch: EAGER, LAZY로 나뉩니다.
EAGER(즉시로딩): 연관관계가 설정된 모든 테이블에 대해서 조인이 이뤄집니다.
LAZY(지연로딩): 기본적으로 연관관계 테이블을 조인하지 않고 조인이 필요한 경우에 Join을 합니다.


EnumType.ORDINAL: enum 순서 값을 DB에 저장
EnumType.STRING: enum 이름을 DB에 저장