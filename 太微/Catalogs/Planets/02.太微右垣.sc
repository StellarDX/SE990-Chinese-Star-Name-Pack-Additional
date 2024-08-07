// Object * n Leo  ---  Spectroscopic Binary  ---  OID=@1804789   (@@37110,8)  ---  coobox=13160 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,Infra-Red Source 
Star "73 Leo A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "73 Leo"
	Class           "K2III"
	AbsMagn         -0.44 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.2353221
		Eccentricity    0.395259139
		Inclination     -1.85089779
		AscendingNode   0
		ArgOfPericenter -154.885961
		MeanAnomaly     22.0794522
	}
}

Star "73 Leo B"
{
	ParentBody      "73 Leo"
	Class           "A0.9?"
}