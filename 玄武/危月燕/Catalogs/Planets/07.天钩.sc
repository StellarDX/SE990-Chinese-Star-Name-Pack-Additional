// Object * 71 Dra  ---  Spectroscopic Binary  ---  OID=@249626   (@@8686,4)  ---  coobox=442 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,UV-emission Source,X-ray Source 
Star "71 Dra A"
{
	DateUpdated     "2024-06-14"
	ParentBody      "71 Dra"
	Class           "B9V"
	AbsMagn         0.193 // 计算的值
	MassKg          6.55591753561355e+30 // log(g) = 4.021 cm/s^2
	RadSol          2.934929 // Gaia DR3
	LumBol          126.80161992715 // 计算的值
	Teff            11306
	FeH             0.775

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.106312069
		Eccentricity    0.457376776
		Inclination     -2.16751671
		AscendingNode   0
		ArgOfPericenter 110.10774
		MeanAnomaly     -1.51587683
	}
}

Star "71 Dra B"
{
	ParentBody      "71 Dra"
	Class           "F3.4?"
}